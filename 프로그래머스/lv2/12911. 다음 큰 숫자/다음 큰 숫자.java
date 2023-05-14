class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        
        int count = 0;
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i)=='1'){
                count++;
            }
        }

        while(true){
            n++;
            String next = Integer.toBinaryString(n);
            int countN = 0;
            for (int i =0; i<next.length(); i++){
                if (next.charAt(i)=='1'){
                    countN++;
                }
            }
         
                if (count == countN){
                    answer = n;
                    break;
                }
            }
        return answer;
        }
    }
