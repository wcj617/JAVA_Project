import java.util.*;

class Padovan {
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
           
            for(int i = 5; i <= N; i++) {
                dp[i] = dp[i - 2] + dp[i - 3];
            }

            System.out.println(dp[N]);
        }
    }    
}
