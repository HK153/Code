import java.util.*;
public class Main{
    public static int answer = 0;
    public static int recursion(String s, int l, int r){
        answer++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i<t; i++){
            String s = in.nextLine();
            answer = 0;
            System.out.println(isPalindrome(s) + " " + answer);
        }

    }
}