import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 입력 받기
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 입력 받기
        }
        Arrays.sort(arr); // 배열 정렬

        // 정렬된 배열 출력
        for (int a : arr) {
            bw.write(a + "\n");
        }

        // BufferedWriter를 flush 및 close
        bw.flush(); // 남아있는 데이터를 모두 출력
        bw.close(); // 자원 해제
    }
}