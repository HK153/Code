import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                ans.add(num);
            }
        }
        
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}