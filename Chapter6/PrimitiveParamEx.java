package Chapter6;

class Data{ int x;}

class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) { // 기본형 매개 변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
