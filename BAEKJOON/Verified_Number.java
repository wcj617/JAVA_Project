package BAEKJOON;
import java.util.*;
class Verified_Number {
    public static void main(String[] args) {
        int min = 0;
        int max = 999_999;
        
            Scanner sc = new Scanner(System.in);

            
            int[] arr = new int[5];
            int[] sum = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                sum[i] = arr[i] * arr[i];
                
            }
            int total = sum[0] + sum[1] + sum[2] + sum[3] + sum[4];
            sc.close();
         System.out.println(total % 10);
           
    }    
}