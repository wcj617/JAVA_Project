import java.util.*;

class Josephus {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        sb.append('<');
        for (int i = 1; i <= N; i++) {
            q.addLast(i);
        }

        int K = sc.nextInt();
        while(q.size() > 1) {            
            for(int i = 0; i < K - 1; i++) {
                int a = q.poll();
                q.addLast(a);
            }

            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');

        System.out.println(sb);

    }
}
