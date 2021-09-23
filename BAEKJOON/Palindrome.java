package BAEKJOON;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        boolean flag = false;
        
        while(true){
            String palindrome = sc.nextLine();
            flag = helper(palindrome);
            if(palindrome.equals("0")) break;
            if (flag)  System.out.println("yes");
            else if (!flag) System.out.println("no");
        }
    }
    
    private static boolean helper(String palindrome) {
        int l = 0, r = palindrome.length() - 1;
        while (l < r) {
            if(palindrome.charAt(l++) != palindrome.charAt(r--)) return false;
        }
        return true;
    }
}
