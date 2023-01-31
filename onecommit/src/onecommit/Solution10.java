package onecommit;
//짝수는 싫어요
public class Solution10 {
	   public static int[] solution(int n) {
		   double a = (double)n/2;
		   System.out.println(a);
		   System.out.println(String.format("%.0f", a));
		   String b = String.format("%.0f", a);
	        int[] answer = new int[Integer.parseInt(b)];
	        for(int i=1; i<=Integer.parseInt(b); i++){
	            answer[i-1]= 2*i-1; 
	            }
	            
	         
        return answer; 
    
	   }
	
		public static void main(String[] args) {
	    	System.out.println(solution(15));
		}

	
}


