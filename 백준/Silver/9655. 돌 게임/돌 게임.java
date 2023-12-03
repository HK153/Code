import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        
        answer += n / 3;
        n = n % 3;
        answer += n;
        
        if(answer % 2 == 0){
            System.out.println("CY");
        }
        else{
            System.out.println("SK");
        }
        
    }
}