import java.util.*;

public class Main {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = in.nextInt();
        int [][] big = new int[n][2];
        for(int i = 0; i<n; i++){
        	for (int j = 0; j<2; j++){
        		big[i][j] = in.nextInt();
        	}
        }
        
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(i!=j && big[i][0] < big[j][0]){
                    if(big[i][1] < big[j][1]){
                        count++;
                    }
                }
            }
            sb.append(count+1).append(" ");
        }

        System.out.println(sb);
    }
}