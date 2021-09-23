package BAEKJOON;
import java.util.*;
public class Zero {
    public static void main(String[] args) {
            // int[] arr = new int[N];
            // int[] arr2 = new int[N];
            // int sum = 0;
            // int sum2 = 0;
            // for (int i = 0, k = 0; i < N; i++) {
            //     arr[i] = sc.nextInt();
            //     sum += arr[i];
                
            //     if (arr[i] == 0) {
            //         arr2[k] = arr[i - 1];
            //         sum2 += arr2[k];
            //         k++;  
            //     } 
            // }
            // System.out.println(sum - sum2);
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            Stack st = new Stack();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int k = sc.nextInt();
                if(k != 0) {
                    st.push(k);
                }else{
                    st.pop();
                }
            }
            while(!st.empty()){
                sum += (int) st.pop();
            }
            System.out.println(sum);
            sc.close();
    }  
}
