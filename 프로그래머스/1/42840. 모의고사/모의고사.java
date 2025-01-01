import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};

        // 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) count[0]++;
            if (answers[i] == two[i % two.length]) count[1]++;
            if (answers[i] == three[i % three.length]) count[2]++;
        }

        // 최고 점수 확인
        int maxCount = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> resultList = new ArrayList<>();

        if (count[0] == maxCount) resultList.add(1);
        if (count[1] == maxCount) resultList.add(2);
        if (count[2] == maxCount) resultList.add(3);

        // 결과 배열 변환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}