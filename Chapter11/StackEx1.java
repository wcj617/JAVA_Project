package Chapter11;
import java.util.*;


class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();
    
    public static void main(String[] args) {
        goURL("1.NATE");
        goURL("2.Yahoo");
        goURL("3.Naver");
        goURL("4.Daum");

        printStatus();

        goBack();
        System.out.println("= ,'back' After click the buttom = ");
        printStatus();

        goBack();
        System.out.println("= , 'forward' After click the buttom= ");
        printStatus();

        goFoward();
        System.out.println("= , 'forward' After click the buttom= ");
        printStatus();

        goURL("codechobo.com");
        System.out.println("= move to new Address = ");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back:" + back);
        System.out.println("forward:" + forward);
        System.out.println("current page is '" + back.peek() + "' this page");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty()) forward.clear();
    }

    public static void goFoward() {
        if(!forward.empty()) back.push(forward.pop());
    }

    public static void goBack() {
        if(!back.empty()) forward.push(back.pop());
    }
}
