package onecommit;
//외계행성의 나이
public class Solution9 {
	public String solution(int age) {
        String answer = "";
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j"};
        String [] ageString = Integer.toString(age).split("");
        for (int j= 0; j<ageString.length; j++){
            int letter = Integer.parseInt(ageString[j]);
            answer= answer + alphabet[letter];    
        }
        return answer;
    }

	
	
//import java.util.stream.Collectors;
//
//class Solution {
//    public String solution(int age) {
//        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
//    }
//}
	
}


