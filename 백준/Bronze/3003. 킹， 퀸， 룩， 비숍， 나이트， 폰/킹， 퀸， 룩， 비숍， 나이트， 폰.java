import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int [] piece = {1,1,2,2,2,8};
        int found = 0;
        for(int i = 0; i<6; i++){
            found = piece[i] - in.nextInt();
            sb.append(found + " ");
        }
        System.out.println(sb);
    }
}