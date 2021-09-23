package Chapter6;

class memberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; error class member variable cannot use instance variable
    static int cv2 = new memberCall().iv; // 이처럼 객체를 생성해야 사용가능

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv);
        memberCall c = new memberCall();
        System.out.println(c.iv); // 객체를 생성한 후에야 인스턴스 변수의 참조 가능.
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); // 에러 클래스 메소드에서는 인스턴스 메서드를 호출할 수 없음
        memberCall c = new memberCall();
        c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할수 있음
    }
    void instanceMethod2() { // 인스턴스 메소드에서는 인스턴스 메소드와 클래스 메서드
        staticMethod1();    // 모두 인스턴스 생성없이 바로 호출이 가능하다.
        instanceMethod1();
    }
}
