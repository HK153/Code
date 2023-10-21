import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        HashMap <Integer, Integer> hs = new HashMap<>();
        
        for(int i =0; i<n; i++){
            int a = in.nextInt();
            if(hs.containsKey(a)){
                hs.replace(a , hs.get(a) + 1);
            }
            else{
                hs.put(a, 1);
            } 
        }
        
        int m = in.nextInt();
        
        for (int i =0; i<m; i++){
            int b = in.nextInt();
            if(hs.containsKey(b)){
                sb.append(hs.get(b));
            }
            else{
                sb.append(0);
            }
            if(i != (m-1)){
                sb.append(" ");
            }
        }
        
        System.out.println(sb);
    }
}