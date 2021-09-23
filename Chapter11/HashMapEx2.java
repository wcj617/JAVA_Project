package Chapter11;
import java.util.*;

class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("kimjava", 100);
        map.put("Leejava", 100);
        map.put("Kangjava", 80);
        map.put("AHnjava", 90);

        Set set =map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("Name: " + e.getKey() + ", Score: " + e.getValue());

        }
        set = map.keySet();
        System.out.println("Member list :" + set);
        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }
        
        System.out.println("total score: " + total);
        System.out.println("average score: " + (float)total/set.size());
        System.out.println("Maximum score: " + Collections.max(values));
        System.out.println("Minimum score: " + Collections.min(values));

    }
}
