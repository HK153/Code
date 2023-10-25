import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Queue <Integer> qu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        
        for (int i =0; i<N; i++){
            String m = in.next();
            if(m.equals("push")){
                temp = in.nextInt();
                qu.add(temp);
            }
            else if(m.equals("pop")){
                if(qu.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(qu.poll()).append("\n");
                }
                
            }
            else if(m.equals("size")){
                sb.append(qu.size()).append("\n");
            }
            else if(m.equals("empty")){
                if(qu.isEmpty()){
                    sb.append("1").append("\n");
                }
                else{
                    sb.append("0").append("\n");
                }
            }
            else if(m.equals("front")){
                if(qu.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(qu.peek()).append("\n");
                }
            }
            else if(m.equals("back")){
                if(qu.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(temp).append("\n");
                }
            }

        }
        System.out.print(sb); 
    }
}