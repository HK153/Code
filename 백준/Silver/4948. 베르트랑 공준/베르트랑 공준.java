import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            int n = in.nextInt();
            // 0이 입력되면 종료
            if (n == 0){
                break;
            }
            
            boolean[] isPrime = new boolean[(n*2)+1];
            Arrays.fill(isPrime, true);
            int count = 0;
            
            for (int i =n+1; i <= n*2; i++){    
                
                 if(isPrime[i]){
                     //소수인지 확인
                 	for (int j = 2; j<=(int)Math.sqrt(i); j++){
                    	if (i % j == 0){
                        	isPrime[i] = false;
                        	break;
                    	}
                	}
                    //소수면 count
                	if(isPrime[i]){
                    count++;
                	}
                 }
                
                //소수 여부 상관없이 배수 지우기
                for (int j = i * 2; j <= n; j += i){
                    isPrime[j] = false;
                }
            }

            System.out.println(count);
        }

       

    }
}