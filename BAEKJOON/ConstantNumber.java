package BAEKJOON;
import java.util.*;
class ConstantNumber {
    public static void main(String[] args) {
        int final1, final2;
        
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String First = sc.next();
            String Second = sc.next();
            
            char[] arr1 = new char[First.length()];
            char[] arr2 = new char[Second.length()];
           
            for(int i = 0; i < First.length(); i++) {
                arr1[i] = First.charAt(i);
            }
            
            char tmp = arr1[0];
            arr1[0] = arr1[2];
            arr1[2] = tmp;
            for(int i = 0; i < Second.length(); i++) {
                arr2[i] = Second.charAt(i);
            }
            char tmp2 = arr2[0];
            arr2[0] = arr2[2];
            arr2[2] = tmp2;

            final1 = Integer.parseInt(new String(arr1));
            final2 = Integer.parseInt(new String(arr2));

            if (final1 > final2) {
                System.out.println(final1);
            }else {
                System.out.println(final2);
            }
        }
        sc.close();

}


}
