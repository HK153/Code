import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int p = 0;
        int count = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (int i =0; i<words.length; i++){
            if (p >= n){
                count++;
                p = 1;
            }
            else {
                p++;
            }
            if (hm.containsKey(words[i])){
                answer[0]=p;
                answer[1]=count;
                break;
            }
            else if (i==0){
                hm.put(words[i],p);
            }
            else if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0]=p;
                answer[1]=count;
                break;
            }
            else{
                hm.put(words[i],p);
                    }

        }
               
       
        return answer;
    }
}