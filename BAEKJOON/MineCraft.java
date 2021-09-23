import java.io.*;
import java.util.*;

class MineCraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] land = new int[N][M];
        long total = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                total += land[i][j];
            }
        }
        long avg = (total + B) / (N * M);
        long maxH = avg > 256 ? 256 : avg;
        int minTime = Integer.MAX_VALUE;
        int height = 0;
     
        for (int k = 0; k <= maxH; k++) {
            int inventory = B;
            int time = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (land[i][j] > k) {
                        time += (land[i][j] - k) * 2;
                        inventory += (land[i][j] - k);
                    }else if (land[i][j] < k) {
                        time += (k - land[i][j]) * 1;
                        inventory -= (k - land[i][j]);
                    }
                }
            }
            if(inventory >= 0){
                if (minTime >= time) {
                    minTime = time;
                    height = k;
                }
            }
        }
        System.out.println(minTime + " " + height);
       
    }
}
