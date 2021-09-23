
import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}
interface Eatable{}
class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> GrapeBox = new FruitBox<Apple>(); //error different Type
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); error


        Box<Toy> toyBox = new Box<Toy>();
       //  Box<Grape> grapeBox = new Box<Apple>(); // error different type;
   
       fruitBox.add(new Fruit());
       fruitBox.add(new Apple());
       fruitBox.add(new Grape());
       appleBox.add(new Apple());
    //    appleBox.add(new Grape());
       grapeBox.add(new Grape());
       // appleBox.add(new Toy()); error Box<Toy> cannot contain Apple
   
       toyBox.add(new Toy());
       // toyBox.add(new Apple()) //error Box<Toy> cannnot contain Apple
   
       System.out.println("fruitBox-" +fruitBox);
       System.out.println("appleBox-" +appleBox);
       System.out.println("grapeBox-" +grapeBox);

       }
   }
   
   class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
   class Box<T> {
       ArrayList<T> list = new ArrayList<T>();
       void add(T item) {list.add(item);   }
       T get(int i) { return list.get(i);  }
       int size()  {return list.size();    }
       public String toString() { return list.toString();}   
   }
