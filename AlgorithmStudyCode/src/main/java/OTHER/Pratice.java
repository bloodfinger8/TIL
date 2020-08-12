package OTHER;

import java.util.ArrayList;

interface Eatable { }

class Fruit implements Eatable{ public String toString(){return "Fruit";}}

class Apple extends Fruit{ public String toString(){return "Apple";}}
class Banana extends Fruit{ public String toString(){return "Banana";}}
class Toy { public String toString (){ return "Toy";}}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

class FruitBox<T extends Fruit> extends Box<T>{ } //Fruit 상속을 받았으며 Eatable 구현한 클래스


public class Pratice{
    public static void main(String[] args) {
        FruitBox<Banana> fruitAppleBox = new FruitBox<>();
        fruitAppleBox.add(new Banana());
        System.out.println(fruitAppleBox);
    }
}
