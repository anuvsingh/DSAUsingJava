public class breakstatement {
    public static void main(String[] args) {
        for (int i=1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop.");
    }
}