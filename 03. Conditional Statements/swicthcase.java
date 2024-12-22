import java.util.Scanner;

public class swicthcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Chicken");
                break;
            case 2:
                System.out.println("Fish");
                break;
            case 3:
                System.out.println("Egg");
                break;
        
            default: System.out.println("We wake up");
                break;
        }
    }
}