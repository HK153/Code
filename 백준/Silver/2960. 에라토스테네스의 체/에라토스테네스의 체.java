import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    return;
                }
                for (int j = i * 2; j <= n; j += i) {
                    if (isPrime[j]) {
                        count++;
                        if (count == k) {
                            System.out.println(j);
                            return;
                        }
                        isPrime[j] = false;
                    }
                }
            }
        }

    }
}