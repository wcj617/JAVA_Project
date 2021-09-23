import java.util.*;

class Hashing {
    static long M = 1234567891;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();
        char[] arr = str.toCharArray();
        
        long sum = 0;

        for (int i = 0; i < L; i++) {
            sum +=((int)arr[i] - 96) * (pow(31, i));
        }
        System.out.println(sum % M);
        sc.close();
    }

    static long pow(int a, int b) {
        
        return b == 0 ? 1 : a * pow(a, b - 1) % M;
    
    }
}

