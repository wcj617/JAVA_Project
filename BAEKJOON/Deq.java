import java.util.*;

import java.io.*;
class Deq {
    public static void main(String[] args) throws IOException {
        Deque<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
     
        int value = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            switch(type){
                case "push_front" :
                value = Integer.parseInt(st.nextToken());
                q.addFirst(value);
                break;
                case "push_back" :
                value = Integer.parseInt(st.nextToken());
                q.addLast(value);
                break;
                case "pop_front" :
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.pollFirst()).append("\n");
                }
                break;
                case "pop_back" :
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.pollLast()).append("\n");
                }
                break;
                case "size" :
                sb.append(q.size()).append("\n");
                break;

                case "empty" :
                if (q.isEmpty()) {
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
                break;
                
                case "front" :
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                } else{
                    sb.append(q.getFirst()).append("\n");
                    
                }
                break;

                case "back" :
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.getLast()).append("\n");
                    
                }
                break;
            }

        }
        System.out.print(sb);
    }
}
