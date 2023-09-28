import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        
        //변수 개수
        int N = sc.nextInt();
        
        //변수 읽어오는 동시에 중복제거
        for (int i =0; i<N; i++){
            set.add(sc.next());
        }
        //배열로 바꾸기
        String [] arr = set.toArray(new String[0]);
        //정렬
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if (s1.length() == s2.length()){
                    return s1.compareTo(s2); //사전순 정렬
                }
                else{
                    return s1.length() - s2.length(); //길이순 정렬
                }
            }
        });
        //stringbulider로 출력
        for(String a: arr){
            sb.append(a).append("\n");
        }
        System.out.print(sb.toString());



    }
}