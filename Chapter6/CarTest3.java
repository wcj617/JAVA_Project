package Chapter6;

class Car {
    String color;
    String gearType;
    int door;
    Car() {
        this("white", "auto",4);
    }

    Car(Car c) {
        this(c.color, c.gearType, c.door);
    }
    Car(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    } 
}
class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println("c1 color= " + c1.color +", gearType=" + c1.gearType + ", door=" +c1.door);
        System.out.println("c2 color= " + c2.color +", gearType=" + c2.gearType + ", door=" +c2.door);
        c1.door = 100;
        System.out.println("c1.door= 100; 수행후");
        System.out.println("c1 color= " + c1.color +", gearType=" + c1.gearType + ", door=" +c1.door);
        System.out.println("c2 color= " + c2.color +", gearType=" + c2.gearType + ", door=" +c2.door);

    }
}