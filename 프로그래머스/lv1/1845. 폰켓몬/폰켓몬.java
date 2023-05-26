import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet <Integer> numHash = new HashSet<>();
        for (int n : nums){
            numHash.add(n);
        }
        if (numHash.size() >= nums.length/2){
                answer= nums.length/2;
        }
        else {
            answer = numHash.size();
        }
            
        return answer;
    }
}