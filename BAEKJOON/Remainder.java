package BAEKJOON;
import java.util.*;

class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            int N = sc.nextInt();
            int R = N % 42;
            set.add(R);
        }
        System.out.print(set.size());
    }    
}
