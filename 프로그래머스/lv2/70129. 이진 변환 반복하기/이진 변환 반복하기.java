class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int change = 0;
        while (!s.equals("1")){
            change++;
            count = 0;
            int size = s.length();
            
            for (int i =0; i<size;i++){
                if (s.charAt(i)=='0'){
                    count++;
                }
            }
        
            answer[0] = change;
            answer[1] += count;
            s = Integer.toBinaryString(size - count);
    
        }
        
        return answer;
    }
}