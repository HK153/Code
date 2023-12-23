import java.util.*;

public class Main {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.nextLine().trim();
        String word2 = in.nextLine().trim();
        
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) - 1);
        }
        
        int answer = frequencyMap.values().stream()
            .mapToInt(Math::abs)
            .sum();
        
        System.out.println(answer);
    }

   
}