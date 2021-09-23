import java.util.*;
import java.io.*;

public class SoringNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}
