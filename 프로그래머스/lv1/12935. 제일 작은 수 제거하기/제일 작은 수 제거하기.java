import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length-1];
            for (int i = 0; i<arr.length; i++){
                if (arr[i] <= min){
                    min = arr[i];
                    count = i;
                }
            }
            for (int j =0; j<arr.length; j++){
                if (j == count){
                    continue;
                }
                else{
                    ans.add(arr[j]);
                }
            }
            for (int k =0; k<ans.size(); k++){
                answer[k] = ans.get(k);
            }
        }
        
        return answer;
    }
}