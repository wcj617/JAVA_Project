import java.util.*;


class FindingN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int S = sc.nextInt();
       Arrays.sort(arr);
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S; i++) {
            if (Arrays.binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }   
        System.out.print(sb);
    }    
}
