public class Logical {
    public static void main (String args[]) {

        // LOGICAL OPERATORS

        // 1. Logial AND
        System.out.println("Logical AND");
        System.out.println((5>2) && (10>9));
        System.out.println((7>10) && (10>5));

        // 2. Logical OR
        System.out.println("Logical OR");
        System.out.println((7>10) || (10>9));
        System.out.println((2>100) || (10<5));

        // 3. Logical NOT
        System.out.println("Logical NOT");
        System.out.println(!(10>5));
        System.out.println(!(10<5));
    }
}