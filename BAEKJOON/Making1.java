import java.util.*;

class Making1 {
    // static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = function(N, 0);
        System.out.println(a);
        sc.close();
    }

    private static int function(int N , int count) {
        if (N < 2) {
            return count;
        }
        return Math.min(function(N /2, count + (N % 2) + 1), function(N / 3, count + (N % 3) + 1)); 
    }
}
