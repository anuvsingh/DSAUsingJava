interface LivingBeing{
    void breathe();
}
interface Animal extends LivingBeing{
    void eat();
}
interface Pet{
    void play();
}
class Dog implements Animal, Pet{
    public void breathe(){
        System.out.println("Dog is Breathing.");
    }
    public void eat(){
        System.out.println("Dog is Eating.");
    }
    public void play(){
        System.out.println("Dog is Playing.");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Dog PitBull = new Dog();
        PitBull.breathe();
        PitBull.eat();
        PitBull.play();
    }
}