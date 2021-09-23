import java.util.*;

public class Escape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x_wise = Math.min(Math.abs(w - x), x);
        int y_wise = Math.min(Math.abs(h - y), y);

        System.out.println(x_wise > y_wise ? y_wise : x_wise);

    }
}
