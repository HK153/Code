import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        boolean check = true;
       
        for (int i =0; i<discount.length -9; i++){
             HashMap<String, Integer> hm = new HashMap<>();
            for (int j = i; j<i+10; j++){
                if (hm.containsKey(discount[j])){
                    hm.put(discount[j], hm.get(discount[j]) +1 );
                }
                else{
                    hm.put(discount[j], 1);
                }
            }
            for (int k = 0; k<want.length; k++){
                if (!hm.containsKey(want[k])){
                    check = false;
                    break;
                }
                else if (hm.get(want[k]) < number[k]){
                    check = false;
                    break;
                }
                else if (hm.get(want[k]) >= number[k]){
                    check = true;
                }
            }
            if (check){
                answer++;
            }

            
        }
        return answer;
    }
}