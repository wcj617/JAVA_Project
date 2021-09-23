import java.util.*;

class Internet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long N = sc.nextLong();

       long[] arr = new long[K];
       long max = 0;
       for (int i = 0; i < K; i++) {
           arr[i] = sc.nextLong();
           max = Math.max(max, arr[i]);
       }

       long l = 1;
       long r = max;
       
       while (l <= r) {
           long num = 0;
           long mid = l + (r - l) / 2;
           for (int i = 0; i < K; i++) {
                num += arr[i] / mid;
           }
           if (num >= N) {
               l = mid + 1;
           }else {
              r = mid - 1;
           }
       }
       
       System.out.println(r);
       sc.close();
        

    }
}
