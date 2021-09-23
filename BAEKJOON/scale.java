import java.util.*;

class scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        String a = "";
        
            for (int i = 0; i < 8; i++) {
                arr[i] = sc.nextInt();    
            }
        

        for (int i = 0; i <arr.length -1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                a = "ascending";
            }else if (arr[i] -1 == arr[i + 1]) {
                a = "descending";
            }else{
                a = "mixed";
                break;
            }
        }

        System.out.println(a);
    }
}
