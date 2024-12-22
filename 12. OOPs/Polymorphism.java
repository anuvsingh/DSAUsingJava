class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5, 8));
        System.out.println(cal.sum(55, 95));
        System.out.println(cal.sum(5, 5, 5));
    }
}