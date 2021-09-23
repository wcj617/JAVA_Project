import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class RGBstreet {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;
    static Integer[][] dp;
    static int[][] Cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        Cost = new int[N][3];
        dp = new Integer[N][3];
        

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            Cost[i][Red] = Integer.parseInt(st.nextToken());
            Cost[i][Green] = Integer.parseInt(st.nextToken());
            Cost[i][Blue] = Integer.parseInt(st.nextToken());
        }
        dp[0][Red] = Cost[0][Red];
        dp[0][Green] = Cost[0][Green];
        dp[0][Blue] = Cost[0][Blue];
        
        System.out.println(Math.min(helper(N - 1, Red), Math.min(helper(N - 1, Green), helper(N - 1, Blue))));
    }

    static int helper(int N, int color) {
        if(dp[N][color] == null) {
           if (color == Red) {
               dp[N][Red] =Math.min(helper(N - 1, Green), helper(N - 1, Blue)) + Cost[N][Red];
           }

           else if(color == Green) {
               dp[N][Green] = Math.min(helper(N - 1, Red), helper(N - 1, Blue)) + Cost[N][Green];
           }

           else {
               dp[N][Blue] = Math.min(helper(N - 1, Green), helper(N - 1, Red)) + Cost[N][Blue];
           }
           
        }
        return dp[N][color];
    }
}
