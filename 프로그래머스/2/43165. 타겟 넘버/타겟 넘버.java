class Solution {
    public int solution(int[] numbers, int target) {
        return find(numbers, target, 0, 0);
    }

    private int find(int[] numbers, int target, int currentIdx, int currentSum) {
        if (currentIdx == numbers.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int positive = find(numbers, target, currentIdx + 1, currentSum + numbers[currentIdx]);
        int negative = find(numbers, target, currentIdx + 1, currentSum - numbers[currentIdx]);
        
        return positive + negative;
    }
}










