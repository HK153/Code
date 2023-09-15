import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] nums = new int[N];
        for(int i = 0; i<N; i++){
            int a = in.nextInt();
            nums[i] = a;
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[N-1]);
         
    }
}