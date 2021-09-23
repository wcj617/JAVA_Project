package BAEKJOON;
import java.util.*;
public class KiGGIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i >= 1; i--) {
            System.out.println(N--);
        }
    }
}
