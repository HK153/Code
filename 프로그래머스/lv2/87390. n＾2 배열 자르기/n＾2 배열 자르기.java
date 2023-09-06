class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            long num = left + i;
            int row = (int) (num / n);
            int col = (int) (num % n);

            if (col >= row) {
                answer[i] = col + 1;
            } else {
                answer[i] = row + 1;
            }
        }

        return answer;
    }
}