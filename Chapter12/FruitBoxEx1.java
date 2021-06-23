package Chapter12;
import java.util.ArrayList;

class Fruit { public String toString() {return "Fruit";}}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}
class FruitBoxEx1 {
     public static void main(String[] args) {
     Box<Fruit> fruitBox = new Box<Fruit>();
     Box<Apple> appleBox = new Box<Apple>();
     Box<Toy> toyBox = new Box<Toy>();
    //  Box<Grape> grapeBox = new Box<Apple>(); // error different type;

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());

    appleBox.add(new Apple());
    appleBox.add(new Apple());
    // appleBox.add(new Toy()); error Box<Toy> cannot contain Apple

    toyBox.add(new Toy());
    // toyBox.add(new Apple()) //error Box<Toy> cannnot contain Apple

    System.out.println(fruitBox);
    System.out.println(appleBox);
    System.out.println(toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);   }
    T get(int i) { return list.get(i);  }
    int size()  {return list.size();    }
    public String toString() { return list.toString();}   
}
