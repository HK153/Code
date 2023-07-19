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
        int[] answer = new int[ans.size()];
        if(ans.isEmpty()){
            answer = new int[] {-1};
        }
        else{
            for (int i =0; i<ans.size(); i++){
                answer[i] = ans.get(i);
            }
        }
        return answer;
    }
}