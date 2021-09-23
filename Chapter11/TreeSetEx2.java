package Chapter11;
import java.util.*;

class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }
        System.out.println("Greater than 50 : " + set.headSet(50));
        System.out.println("Less than 50: " + set.tailSet(50));
    }    
}
