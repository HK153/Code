class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean isPrime = true;
        for (int i =0; i<nums.length; i++){
            for (int j =i+1; j<nums.length; j++){
                for (int k = j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                 
                    for (int y = 2; y<=sum/2; y++){
                        if (sum % y == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime){
                        answer++;
                    }
                    else{
                        isPrime = true;
                    }
                }
            }
        }

        return answer;
    }
}