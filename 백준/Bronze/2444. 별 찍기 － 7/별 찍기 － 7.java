import java.util.*;
public class Main{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=N; i++){
            String blank = " ".repeat(N-i);
            String star = "*".repeat(i*2-1);
            System.out.println(blank + star);
        }
        for (int i = N-1; i>=1; i--){
            String blank = " ".repeat(N-i);
            String star = "*".repeat(i*2-1);
            System.out.println(blank + star);
        }
    }
}