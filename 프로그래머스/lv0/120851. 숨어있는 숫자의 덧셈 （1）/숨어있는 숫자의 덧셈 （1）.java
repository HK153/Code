class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");
        for(String a :arr) {
        	try { 
        		int num = Integer.parseInt(a);
        		 answer = answer + num;
        	}catch (Exception e) {
        		continue;
        	}
        }
        return answer;
    }
}