import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashSet <String> hs = new HashSet<>();
        int answer = 0;
        for(int i = 0; i<n; i++){
            String s = in.nextLine();
            hs.clear();
            String before = "";
            boolean check = true;
            for (int j = 0; j<s.length(); j++){
                String l = Character.toString(s.charAt(j));
                if (before.equals(l)){
                    continue;
                }
                else if (hs.contains(l)){
                    check = false;
                    break;
                }
                else{
                    hs.add(l);
                    before = l;
                }
            }
            if(check){
                answer++;
            }
        }
        System.out.println(answer);  
    }
}