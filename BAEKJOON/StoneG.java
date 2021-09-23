import java.util.*;
class StoneG {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = N % 2;
    
        if (R == 1 ) {
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
        sc.close();
    }

}
