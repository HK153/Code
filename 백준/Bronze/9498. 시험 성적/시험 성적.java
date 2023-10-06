import java.util.*;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        String s = "";
        if(N >=90) s = "A";
        else if (N >=80) s = "B";
        else if (N >=70) s = "C";
        else if (N >=60) s = "D";
        else s = "F";
        System.out.println(s);
    }
}