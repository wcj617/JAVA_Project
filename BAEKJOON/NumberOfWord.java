import java.util.*;

class NumberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String[] str2 = str1.split(" ");
        
        int count = 0;
        if (str1.isEmpty()) {
            System.out.println(0);
        }else{

            for (int i = 0; i < str2.length; i++) {
                
            
                    count++;
                
            }
            System.out.println(count);
        }
    }
}
