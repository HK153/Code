import java.util.*;

public class Main {
    static int[] sequence;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = in.nextInt();
        }

        Arrays.sort(sequence);
        generateSequence(new int[M], 0);
        System.out.println(sb);
    }

    static void generateSequence(int[] result, int index) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            result[index] = sequence[i];
            generateSequence(result, index + 1);
            
            // 중복된 수열 제거
            while (i < N - 1 && sequence[i] == sequence[i + 1]) {
                i++;
            }
        }
    }
}