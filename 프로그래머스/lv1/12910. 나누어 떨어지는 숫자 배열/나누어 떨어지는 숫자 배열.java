import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ans = new ArrayList();
        Arrays.sort(arr);
        
        for (int a : arr){
            if (a%divisor == 0){
                ans.add(a);
            }
            else{
                continue;
            }
        }
        
        if(ans.isEmpty()){
            int [] answer = new int[] {-1};
            return answer;
        }
        int[] answer = new int[ans.size()];
        for (int i =0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}