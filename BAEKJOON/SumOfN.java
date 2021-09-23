import java.util.*;



class SumOfN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int F = sc.nextInt();
    String s = sc.next();
    int sum = 0;
   for (int i = 0; i < F; i++) {
    sum += s.charAt(i) - '0'; 
   }
   System.out.println(sum);
  }
}
