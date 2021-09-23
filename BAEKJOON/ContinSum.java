import java.util.*;

class ContinSum {
    static long arr[];
    static long dp[]; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new long[N];
        dp = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        dp[0] = arr[0];
        long max = Integer.MIN_VALUE;
        max = dp[0];
        for(int i = 1; i < N; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }    
}
