import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] visited = new boolean[101]; // 1부터 100까지의 컴퓨터

        Queue<Integer> qu = new LinkedList<>();
        int n = in.nextInt();
        int l = in.nextInt();
        int[][] link = new int[l][2];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 2; j++) {
                link[i][j] = in.nextInt();
            }
        }

        qu.add(1);
        visited[1] = true;

        while (!qu.isEmpty()) {
            int infect = qu.poll();
            for (int i = 0; i < l; i++) {
                if (link[i][0] == infect && !visited[link[i][1]]) {
                    qu.add(link[i][1]);
                    visited[link[i][1]] = true;
                }
                if (link[i][1] == infect && !visited[link[i][0]]) {
                    qu.add(link[i][0]);
                    visited[link[i][0]] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (visited[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}