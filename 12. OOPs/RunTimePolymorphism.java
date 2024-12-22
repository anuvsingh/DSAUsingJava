class Animal{
    void eat(){
        System.out.println("Eats Anything...");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass...");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}