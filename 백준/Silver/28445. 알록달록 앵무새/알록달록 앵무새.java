import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
        HashSet <String> hs = new HashSet<>();
        
        for(int i=0; i<4; i++){
            String s = in.next();    
            hs.add(s);
        }
        List <String> color = new ArrayList<>(hs);
        Collections.sort(color);
        for(String c : color){
        	for(String o : color){
        		sb.append(c + " ");
        		sb.append(o).append("\n");
        	}
        }
        System.out.println(sb);
        
    }
}