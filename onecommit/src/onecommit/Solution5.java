package onecommit;

//치킨 쿠폰  
public class Solution5 {
	
	    public static int solution(int chicken) {
	    	int answer = chicken/10; // 첫 보너스 치킨 개수 
	    	int result = answer;
	        int bonus = chicken % 10; // 보너스치킨 외의 남은 치킨 수
	        chicken = answer + bonus; //새로 보너스 얻을 수 있는 치킨 수
	       
	        while (chicken >=10) {
	        	answer = chicken/10;
	        	result = result + answer;
	        	bonus = chicken %10;
	        	chicken = answer + bonus;
	        };
	   
	        return result;
	    }

	    public static void main(String[] args) {
	    	System.out.println(solution(100));
		}
	
}
