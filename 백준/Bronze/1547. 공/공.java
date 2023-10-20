import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer []arr = {1,2,3};
        
        for(int i =0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int aIndex = Arrays.asList(arr).indexOf(a);
            int bIndex = Arrays.asList(arr).indexOf(b);
            arr[aIndex] = b;
            arr[bIndex] = a;
        }
        System.out.println(arr[0]);
    }
}