import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = 5;
        String [] words = new String[N];
        for (int i =0; i<N; i++){
            String w = in.next();
            words[i] = w;
        }
        for(int i =0; i<15; i++){
            for(int j =0; j<N; j++){
                if(words[j].length() <= i){
                    continue;
                }
                else{
                    sb.append(words[j].charAt(i));
                }
            }
        }
        
        System.out.print(sb); 
    }
}