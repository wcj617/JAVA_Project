package Chapter11;
import java.util.*;

class ListIteratorEx1 {
    public static void main(String[] args) {
     ArrayList list = new ArrayList();
     list.add("1");
     list.add("2");
     list.add("3");
     list.add("4");
     list.add("5");

     ListIterator it = list.listIterator();
     
     

    while (it.hasNext()) {
         System.out.print(it.next());
    }

    while(it.hasPrevious()) {
        System.out.println(it.previous());
    }
    
     System.out.println();
    }    
}
