import java.util.*;

class suger {
    static Integer[] dp;
    static int[] Suger;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Suger = new int[2];
        dp = new Integer[target + 1];
        Suger[0] = 3;
        Suger[1] = 5;

      

        Arrays.fill(dp, Integer.MAX_VALUE - 1);

        dp[0] = 0;
        // dp[1] = 0;
        // dp[2] = 0;
        
        for (int i = 0; i < 2; i++) {
            for(int j = Suger[i]; j <= target; j++) {
                dp[j] = Math.min(dp[j], dp[j - Suger[i]] + 1);
            }
        } 
        System.out.println(dp[target] == Integer.MAX_VALUE - 1 ? -1 : dp[target]);
        sc.close();
    }    
}
