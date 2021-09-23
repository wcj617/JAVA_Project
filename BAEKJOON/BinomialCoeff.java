package BAEKJOON;
import java.util.*;
class BinomialCoeff {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[6];
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int num = helper(n) / (helper(k) * helper(n - k));
        System.out.println(num);
    }
        private static int helper(int n) {
            if (n<=0 || n> 10) return -1;
            if (n <= 1) return 1;
            else {
                return n * helper(n - 1);
            }
        }

}
