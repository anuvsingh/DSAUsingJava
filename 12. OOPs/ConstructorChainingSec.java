class Base{
    String name;
    Base(){
        this(" ");
        System.out.println("No Argument Constructor of Base Class.");
    }
    Base(String name){
        this.name = name;
        System.out.println("Calling Parameterised Constructor of Base.");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("No Argument Constructor of Derived.");
    }
    Derived(String name){
        System.out.println(name);
        System.out.println("Calling Parameterised Constructor of Derived.");
    }
}
public class ConstructorChainingSec {
    public static void main(String[] args) {
        Derived obj = new Derived("test");
    }
}