class A{
    public void methodA(){
        System.out.println("Base Class Called");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Child Class Called");
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }
}