import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main (String[]args){
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            int dice = sc.nextInt();
            if(map.containsKey(dice)){
                map.put(dice, map.get(dice)+1);
            }
            else{
                map.put(dice, 1);
            }
        }
        
        if(map.size() == 1){
            for(Integer key : map.keySet()){
                answer = 10000 + key * 1000;
            }
        }
        else if (map.size() == 2){
            for(Integer key : map.keySet()){
                if(map.get(key) == 2){
                    answer = 1000 + key * 100;
                }
            }
        }
        else{
            int max = 0;
            for(Integer key : map.keySet()){
                int temp = key;
                if(temp > max){
                    max = temp;
                }
            }
            answer = max*100;
        }
        System.out.println(answer);
    }
}