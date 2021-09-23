import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (N-- > 0) {

           
            int value = sc.nextInt();
            if (value > start) {
                for(int i = start + 1; i <= value; i++) {
                    st.push(i);
                    sb.append('+').append('\n');
    
                }
                start = value;
            }else if(st.peek() != value) {
                System.out.println("NO");
                System.exit(0);
            }
            st.pop();
            sb.append('-').append('\n');
        }
        System.out.print(sb);
        sc.close();
    }
}
