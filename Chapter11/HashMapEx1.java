package Chapter11;
import java.util.*;

 class HashMapEx1 {
     public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("myID", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");
    
    Scanner s = new Scanner(System.in);

    while (true) {
        System.out.println("Please type your id and password");
        System.out.print("id :");
        String id = s.nextLine().trim();

        System.out.print("password:");
        String password = s.nextLine().trim();
        System.out.println();

        if(!map.containsKey(id)) {
            System.out.println("nonexistent in the map" + "Please try again");
            continue;
        }
        if(!(map.get(id)).equals(password)) {
            System.out.println("your password does not match with your id. please try again");
            
        }else {
            System.out.println("id and password are matched");
            break;
        }
    }
    }    
}
