public class squarepattern {
    public static void main(String[] args) {
        System.out.println("Using for loop");
        for (int line = 1; line <= 4; line++) {
            System.out.println("* * * *");
        }

        int line = 1;
        System.out.println("Using while loop");
        while (line <= 4) {
            System.out.println("*****");
            line++;
        }
    }
}