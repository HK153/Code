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
        
        int M = sc.nextInt();
        
        for (int i =0; i<M; i++){
            int m = sc.nextInt();
            if (set.contains(m)){
                sb.append("1 ");
 
            }
            else if(i == M-1){
                if (set.contains(m)){
                    sb.append("1");  
                }
                else{
                    sb.append("0");
                }
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.print(sb.toString());
        
        
        
    }
}