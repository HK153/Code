package onecommit;

public class Solution3 {
	
	    public int solution(int num, int k) {
	        int answer = 0;
	        String numString = String.valueOf(num);
	        if (numString.contains(Integer.toString(k))){
	            answer=numString.indexOf(Integer.toString(k))+1;
	        }
	        else{
	            answer=-1;
	        }
	        return answer;
	    }
	
}
