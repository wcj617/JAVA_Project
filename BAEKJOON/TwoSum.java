package BAEKJOON;
import java.util.*;
class TwoSum {
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sum = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
           
                while(sc2.hasNext()) {
                    
                    sum[i] += sc2.nextInt();
                     
                }
                    if (i != 0) System.out.println(sum[i]);
                
        }
    }
}
