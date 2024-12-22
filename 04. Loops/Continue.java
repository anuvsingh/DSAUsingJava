public class Continue {
    public static void main(String[] args) {

        //CONTINUE Statement
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}