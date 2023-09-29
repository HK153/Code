import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<N; i++){
            set.add(sc.nextInt());
        }
        
        Integer [] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        for(int a : arr){
            sb.append(a).append(" ");
        }
        System.out.print(sb.toString());
        
        
        
    }
}