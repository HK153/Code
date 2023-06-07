import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i =0; i<name.length; i++){
            hm.put(name[i], yearning[i]);
        }
        for (int j =0; j<photo.length; j++){
            for (String n : photo[j]){
                if (hm.containsKey(n)){
                    answer[j] += hm.get(n);
                }
            }
        }
        
        return answer;
    }
}