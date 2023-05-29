import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<commands.length; i++){
            for (int j = commands[i][0]-1; j<commands[i][1]; j++){
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2]-1);
            arr.clear();
        }
        
        return answer;
    }
}