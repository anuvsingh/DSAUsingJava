public class overloading {

    // Function overloading using different no. of parameters.
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }

    // Function overloading using different data types of parameters.
    public static int multiply (int a, int b) {
        return a * b;
    }
    public static float multiply (float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Addition: ");
        System.out.println(sum(10, 2));
        System.out.println(sum(5, 10, 2));
        
        System.out.println("Multiplication: ");
        System.out.println(multiply(20, 2));
        System.out.println(multiply(2.2f, 1.1f));
    }
}