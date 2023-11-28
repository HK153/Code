import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println(in.nextInt());
            return;
        } else if (n == 2) {
            int first = in.nextInt();
            int second = in.nextInt();
            System.out.println(first + second);
            return;
        }

        int[] step = new int[n + 1];
        int[] score = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            step[i] = in.nextInt();
        }

        score[1] = step[1];
        score[2] = step[1] + step[2];
        for (int i = 3; i <= n; i++) {
            score[i] = Math.max(step[i] + step[i - 1] + score[i - 3], step[i] + score[i - 2]);
        }
        System.out.println(score[n]);
    }
}