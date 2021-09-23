import java.util.*;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        int N = sc.nextInt();
        double total = 0;
        for(int i = 0; i < N; i++){
            
            list.add(sc.nextDouble());
        }
        for (int i = 0; i < N; i++){

            total += (list.get(i))*100/(Collections.max(list));
        }

        System.out.println(total / N);
    }
}
