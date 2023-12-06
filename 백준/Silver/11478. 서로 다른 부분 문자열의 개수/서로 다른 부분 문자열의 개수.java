import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int answer = 0;
        
        HashSet <String> hs = new HashSet<>();
        for(int i =0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String substring = s.substring(i, j);
                hs.add(substring);
            }
        }
        answer = hs.size();
        System.out.println(answer);
        
    }
}