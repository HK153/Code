import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer> order = new ArrayList<>();
        Queue<String> qlist = new LinkedList<>();
        
        // 초기 순서 기록
        for (int i = 0; i < priorities.length; i++) {
            qlist.add(priorities[i] + "" + i);
        }
        
        // 중요도 max 값 구하기
        Arrays.sort(priorities);
        int maxIndex = priorities.length - 1;
        int max = priorities[maxIndex];
        
        // 우선순위에 따라 처리
        while (!qlist.isEmpty()) {
            if (Character.getNumericValue(qlist.peek().charAt(0)) == max) {
                // 뽑은 프로세스의 순서 기록
                order.add(Integer.parseInt(qlist.peek().substring(1)));
                // 큐 삭제
                qlist.remove();
                // 우선순위 값 수정
                maxIndex--;
                if (maxIndex >= 0) {
                    max = priorities[maxIndex];
                }
            } else {
                qlist.add(qlist.peek());
                qlist.remove();
            }
        }
        
        // 프로세스 실행 순서 탐색
        for (int j = 0; j < order.size(); j++) {
            if (order.get(j) == location) {
                answer = j + 1;
            }
        }
       
        return answer;
    }
}