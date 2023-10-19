import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        boolean b = false;
        
        if ((y % 4) ==0 && (y % 100) != 0){
            b = true;
        }
        else if ((y % 400) == 0){
            b = true;
        }
        
        if (b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}