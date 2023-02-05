import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList numarr = new ArrayList();
       
        for (int num : numlist){
            if(num%n==0){
                numarr.add(num);
            }
        }
        int[] answer = new int[numarr.size()];
        for (int i =0; i<numarr.size(); i++){
            answer[i]= (int)numarr.get(i);
        }
        
        return answer;
    }
}