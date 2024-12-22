// within same class using this() keyword

class Temp{
    Temp(){
        this(5);
        System.out.println("The Default Constructor");
    }
    Temp(int x){
        this(5, 15);
        System.out.println(x);
    }
    Temp(int x, int y){
        System.out.println(x * y);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        new Temp();
    }
}