import java.util.*;

import java.io.*;
class STA {
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
                case "push" :
                value = Integer.parseInt(st.nextToken());
                q.addLast(value);
                break;

                case "pop" :
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
                
                case "top" :
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.getLast()).append("\n");
                    
                }
                break;
            }

        }
        System.out.println(sb);
    }
}
