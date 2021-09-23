import java.util.*;


class FindingInc {
    static int[] dp;
    static int[] arr;
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        arr = new int[1001];
        dp = new int[1001];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                int num = arr[i];
                if (num < arr[j]) {
                    count++;
                }
                max = Math.max(max, count);    
            }
        }

        System.out.println(max);
        sc.close();
    }
}
