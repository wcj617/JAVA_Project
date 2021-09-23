import java.util.*;

class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N + 1][N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i][1] = 1;
            for(int j = 2; j <= N; j++){
                arr[i][j] = arr[i -1][j -1] + arr[i -1][j];
            }
            arr[i][N] = 1;
            
        }

        System.out.println(arr[N][K]);
        sc.close();
    }    
}
