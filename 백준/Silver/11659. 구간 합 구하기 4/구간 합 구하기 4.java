import java.util.Scanner;
public class Main {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int [] nums = new int[N];
        for(int i = 0; i<N; i++){
            int a = in.nextInt();
            nums[i] = a;
        }
        int[] prefixSum = new int[N];
        prefixSum[0] = nums[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
       for(int k = 0; k<M; k++){
           int i = in.nextInt();
           int j = in.nextInt();
           int sum = 0;
           if (i > 1){
               sum =  prefixSum[j-1] -  prefixSum[i-2];
           }
           else {
               sum = prefixSum[j - 1];
           }
          
           System.out.println(sum);
       }
        
    }
}