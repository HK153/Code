import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        
        for (int i = 0; i<N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sb.append(A+B).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}