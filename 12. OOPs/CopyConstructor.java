class Fruit{
    private double fprice;
    private String fname;
    Fruit(double fprice, String fname){
        this.fprice = fprice;
        this.fname = fname;
    }
    Fruit(Fruit fruit){
        System.out.println("\n After invoking the Copy Constructor.");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }
    double showPrice(){
        return fprice;
    }
    String showName(){
        return fname;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(399, "Anubhav");
        System.out.println("Name of the First Fruit: " + f1.showName());
        System.out.println("Price of the First Fruit: " + f1.showPrice());
        // Copy Constructor
        Fruit f2 = new Fruit(f1);
        System.out.println("Name of the Second Fruit: " + f2.showName());
        System.out.println("Price of the Second Fruit: " + f2.showPrice());
    }
}