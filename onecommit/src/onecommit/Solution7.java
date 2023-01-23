package onecommit;

import java.util.ArrayList;
//저주의 숫자 3
public class Solution7 {
	public static int solution(int n) {
	        ArrayList<Object> list = new ArrayList();
	        int count=0;
	        int answer =0;
	        while (true) {
	        	count++;
	        	String num = String.valueOf(count);
	        	if (count % 3 ==0 || num.contains("3")){
	        		continue;
	        	}
	        	else {
	        		list.add(count);
	        	}
	        	if (n == list.size()) {
	        		break;
	        	}
	        }
	        answer = (int) list.get(n-1);
	        
	        return answer;
	    }
	
	
	
//	class Solution {
//	    public int solution(int n) {
//	        int answer = 0;
//
//	        for (int i = 1; i <= n; i++) {
//	            answer++;
//	            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
//	                i--;
//	            }
//	        }
//
//	        return answer;
//	    }
//	}
//	
	
	public static void main(String[] args) {
    	System.out.println(solution(15));
	}

}
