import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Deque <Integer> dq = new LinkedList<>();
        
        int n = in.nextInt();
        
        for(int i = 1; i<=n ; i++){
            dq.add(i);
        }
        while(dq.size()!=1){
            dq.poll();
            int temp = dq.poll();
            dq.add(temp);
        }
        System.out.println(dq.peek());
    }
}