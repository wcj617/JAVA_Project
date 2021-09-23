import java.util.*;

class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v = new Vector<Integer>();

        for (int i = 0; i < 9; i++) {
            v.add(sc.nextInt());
        }
        
        int m = Collections.max(v);
        System.out.println(m);
        System.out.println(v.indexOf(m) + 1);
        
    }
}
