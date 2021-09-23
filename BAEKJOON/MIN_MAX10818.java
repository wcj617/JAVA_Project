package BAEKJOON;
import java.util.*;

class MIN_MAX10818 {
    public static void main(String[] args) {
        int min = -1_000_000;
        int max = 1_000_000;
        
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[N-1]);
    }    
}
