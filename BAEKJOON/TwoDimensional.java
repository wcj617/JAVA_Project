import java.util.*;

class TwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();
            for(int i = 0; i < K; i++) {
                int sum = 0;
                int I = sc.nextInt();
                int J = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                for (int k = I -1; k <= x - 1; k++) {      
                    for(int l = J - 1; l <= y - 1; l ++) {
                        sum += arr[k][l];
                    }
                } 
                System.out.println(sum);
            }
        sc.close();
    }    
}
