import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int total = brown + yellow;
        for (int i =1; i<=Math.sqrt(total); i++){
            if (total%i == 0){
                a.add(i);
                b.add(total/i);
            }
        }

        for (int j = a.size()-1; j>=0; j--){
            if (a.get(j)*b.get(j) == total && (a.get(j)-2)*(b.get(j)-2) == yellow){
                answer[0]=b.get(j);
                answer[1]=a.get(j);
                break;
            }
        }
        
        return answer;
    }
}