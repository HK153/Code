import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int a : arr) {
            if (a % divisor == 0) {
                ans.add(a);
            }
        }

        if (ans.isEmpty()) {
            return new int[] {-1};
        }

        return ans.stream().mapToInt(i -> i).sorted().toArray();
    }
}