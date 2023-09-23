import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack <>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        
        
        for (int i =0; i<n; i++){
            String command = sc.next();
            if(command.equals("push")){
                int num = sc.nextInt();
                st.push(num);
            }
            else if(command.equals("pop")){
                if (st.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(st.pop()).append('\n');
                } 
            }
            else if(command.equals("size")){
                sb.append(st.size()).append('\n');
            }
            else if(command.equals("empty")){
                if (st.isEmpty()){
                    sb.append(1).append('\n');
                }
                else{
                    sb.append(0).append('\n');
                }
                
            }
             else if(command.equals("top")){
                 if(st.isEmpty()){
                     sb.append(-1).append('\n');
                 }
                 else{
                     sb.append(st.peek()).append('\n');
                 }
      
             }
        }
        System.out.print(sb.toString());
        sc.close();
    }
}