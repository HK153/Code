import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
 
        Map<Character, Integer> dial = new HashMap<>();
        char [] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int digit = 2;
        
        for (char letter : letters){
            dial.put(letter, digit);
            if (letter == 'C'|| letter == 'F' || letter == 'I' || letter == 'L' || letter == 'O' || letter == 'S' || letter == 'V'){
                digit++;
            }
        }
        
        int answer = 0;
        String textLine = in.nextLine();
        char [] text = textLine.toCharArray(); 
        
        for(char t : text){
            answer += dial.get(t);
        }
        answer += text.length;
        
        System.out.println(answer);
    }
}