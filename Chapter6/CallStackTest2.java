package Chapter6;
import java.util.*;


 class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작 되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 끝");
    }

    static void secondMethod() {
        System.out.println("secondMethod 시작함");
        System.out.println("secondMethod 끝");
    }
}
