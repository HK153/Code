import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 상자의 개수 입력
        int n = in.nextInt();

        // 각 상자의 크기 입력
        int[] boxSizes = new int[n];
        for (int i = 0; i < n; i++) {
            boxSizes[i] = in.nextInt();
        }

        // 각 상자를 시작점으로 하는 최대 상자 개수 배열 초기화
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // 최소한 현재 상자 하나는 들어갈 수 있음
        }

        // DP을 통한 최대 상자 개수 계산
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (boxSizes[j] < boxSizes[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 최대 상자 개수 찾기
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        // 결과 출력
        System.out.println(max);


    }
}