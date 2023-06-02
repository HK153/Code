import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i =0; i<numbers.length; i++){
            for (int j =0; j<numbers.length; j++){
                if (i==j){
                    continue;
                }
                arr.add(numbers[i]+numbers[j]);
            }
        }
        Collections.sort(arr);
        for (int a : arr){
            if (ans.isEmpty()){
                ans.add(a);
                
            }
            else if(a == ans.get(ans.size()-1)){
                continue;
            }
            else{
                ans.add(a);
            }
        }
        int[] answer = new int[ans.size()];
        for (int k =0; k<ans.size(); k++){
            answer[k] = ans.get(k);
        }
        return answer;
    }
}