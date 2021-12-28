

public class PrintfEx1 {
    public static void main (String[] args) {
        byte b = 1;
        System.out.printf("b= %d%n", b);
        short s = 2;
        System.out.printf("s= %d%n", s);
        char c ='A';
        System.out.printf("c=%c, %d %n", c, (int)c);
        int finger = 10;
        System.out.printf("finger[%5d]%n", finger);
        System.out.printf("finger[%-5d]%n", finger);
        System.out.printf("finger[%05d]%n", finger);
        long big = 100_000_000L;
        System.out.printf("big= %d%n", big);
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        System.out.printf("hex=%#x%n", hex);
        int octNum = 010;
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        int hexNum = 0x10;
        System.out.printf("hexNum=%x, %d%n" , hexNum, hexNum);
        int binNum = 0b10;
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum) , binNum);
    }
}
