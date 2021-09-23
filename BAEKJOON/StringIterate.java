import java.util.*;

class StringIterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            char[] a = sc.next().toCharArray();


            for (int k = 0; k < a.length; k++) {
                for (int j = 0; j < S; j++) {
                    System.out.print(a[k]);
                }
                
            }
            System.out.println();
        }
    }
}
