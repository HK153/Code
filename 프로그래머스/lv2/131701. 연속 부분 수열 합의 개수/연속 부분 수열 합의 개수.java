import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        HashSet <Integer> hs = new HashSet<>();
        int answer = 0;
        int sum =0;
        for(int i =0; i<elements.length; i++){
            for(int j =0; j<elements.length; j++){
                for (int k =i; k<=i+j; k++){
                    sum += elements[k % elements.length];
                }
                hs.add(sum);
                sum =0;
            }
        }
        answer = hs.size();
        return answer;
    }
}