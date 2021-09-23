import java.util.*;

class alarm {
    static int hour,min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45 && M < 60) {
            min = M - 45;
            hour = H;
        }else {
            min = M + 15;

            hour = (H == 0) ? 23 : (H - 1);
        }
        System.out.println(hour +" "+ min);
    }
}
