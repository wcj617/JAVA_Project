import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Coin2 {

    static Integer[] dp;
    static int[] Coin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
      

       
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        Coin = new int[N];
        dp = new Integer[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            Coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            for(int j = Coin[i]; j <= target; j++) {
                dp[j] = Math.min(dp[j], dp[j - Coin[i]] + 1);
            }
        }

        System.out.println(dp[target] == Integer.MAX_VALUE ? -1 : dp[target]);
    }    
}
