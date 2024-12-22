abstract class Animal{
    void eat(){
        System.out.println("Animal Eats.");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 Legs.");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 Legs.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}