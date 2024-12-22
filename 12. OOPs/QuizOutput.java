abstract class Car{
    static{
        System.out.println("1");
    }
    public Car(String name){
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}
class Bluecar extends Car{
    {
        System.out.println("4");
    }
    public Bluecar(){
        super("blue");
        System.out.println("5");
    }
}
public class QuizOutput {
    public static void main(String[] args) {
        new Bluecar();
    }
}