import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int [] coin = new int[N];
        int answer = 0;
        for(int i =0; i<N; i++){
            coin[i] = in.nextInt();
        }
        
        for(int i = N-1; i>=0; i--){
            if(K >= coin[i]){
                answer += K/coin[i];
                K %= coin[i];
            }
        }
        
        System.out.print(answer); 
    }
}