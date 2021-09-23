import java.util.*;
class ACMHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String q;

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if ((N / H) <= W ) {
                int Quotient = (N / H);
                int reminder = N % H;
                if (reminder == 0) {
                    q = String.valueOf(Quotient >= 10 ? (Quotient) : "0" + (Quotient));    
                }else {
                    q = String.valueOf(Quotient >= 9 ? (Quotient + 1) : "0" + (Quotient + 1));
                }
                String r = String.valueOf((reminder == 0) ? H : reminder);
                int A = Integer.parseInt(r + q);
                System.out.println(A);
            } else {
                continue;
            }
        }
        sc.close();
    }
}
