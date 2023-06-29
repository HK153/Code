import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue <String> c1 = new LinkedList<>();
        Queue <String> c2 = new LinkedList<>();
        for (String c : cards1){
            c1.add(c);
        }
        for (String c : cards2){
            c2.add(c);
        }
        for (String g : goal){
            if (g.equals(c1.peek())){
                c1.poll();
            }
            else if (g.equals(c2.peek())){
                c2.poll();
            }
            else{
                answer = "No";
            }
        }
        return answer;
    }
}