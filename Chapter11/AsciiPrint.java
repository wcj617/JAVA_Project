package Chapter11;
import java.util.*;

class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';

        for(int i = 0; i < 95; i++) {
            System.out.print(ch++);
        }
    }    
}
