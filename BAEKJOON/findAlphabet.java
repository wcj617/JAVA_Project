import java.util.*;

class findAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String str1 ="abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(s.indexOf(str1.charAt(i)) + " ");
        }
    }
}
