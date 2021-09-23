package Chapter11;
import java.util.*;
class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList (10);
        ArrayList copy1 = new ArrayList();
        ArrayList copy2 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            original.add(i +"");

        }

        Iterator it = original.iterator();

        while(it.hasNext()) {
            copy1.add(it.next());

        }

        System.out.println("= Original에서 Copy1로 복사(copy) =");
        System.out.println("original:" + original);
        System.out.println("copy1:" + copy1);
        System.out.println();

        it = original.iterator(); // Iterator는 재사용이 안되므로, 다시 얻어와야한다.

        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }
        System.out.println("= Original에서 copy2로 이동(move) =");
        System.out.println("original:" + original);
        System.out.println("copy2:" + copy2);
    }    
}