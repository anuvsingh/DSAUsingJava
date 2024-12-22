class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //creating a Pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";    //or    p1.setColor("Yellow")
        System.out.println(p1.color);
    }
}