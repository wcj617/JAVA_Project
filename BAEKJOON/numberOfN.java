import java.util.*;


class numberOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int total = A * B * C;

        String str = String.valueOf(total);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

       
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            if(map.containsKey((char)(i +'0'))) {
                System.out.println(map.get((char)(i + '0')));
            }else {
                System.out.println("0");
            }
        }
    }    
}
