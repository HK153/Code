import java.util.Scanner;
public class Main {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        
        System.out.println(solution(a,b));
    }
    
    public static String solution (int a, int b){
        String answer = "";
        if (a>b){
            answer = ">";
        }
        else if (a<b){
            answer = "<";
        }
        else {
            answer = "==";
        }
                
        return answer;
    }
}