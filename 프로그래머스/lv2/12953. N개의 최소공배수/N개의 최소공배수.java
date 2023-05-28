import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count =0;
        if (arr.length ==1){
            answer = arr[0];
        }else{
            int a = arr[arr.length-1]*arr[arr.length-2];
            while(true){
                for(int r : arr){
                    if (a%r ==0){
                        count++;
                    }
                }
                if (count == arr.length){
                    answer = a;
                    break;
                }
                else {
                    a++;
                    count =0;
                }
            }
        }
        return answer;
    }
}