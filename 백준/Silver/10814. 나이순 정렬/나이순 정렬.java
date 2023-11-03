import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();
        in.nextLine();
        Map <Integer, List<String>> member = new HashMap<>();
        
        for (int i = 0; i < N; i++){
            String [] info = in.nextLine().split(" ");
            int age = Integer.parseInt(info[0]);
            String name = info[1];
            
            if(member.containsKey(age)){
                member.get(age).add(name);
            }
            else{
                List<String> names = new ArrayList<>();
                names.add(name);
                member.put(age, names);
            }
        }
        List<Integer> sortedAges = new ArrayList<>(member.keySet());
        Collections.sort(sortedAges);
        
        for(int age : sortedAges){
            for(String name : member.get(age)){
                sb.append(age + " " + name + "\n");
            }
        }
        
        System.out.print(sb); 
    }
}