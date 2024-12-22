public class Unary {
    public static void main (String args[]) {
        
        // INCREMENT OPERATORS
        System.out.println("PreIncrement");
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("PostIncrement");
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        //DECREMENT OPERATORS
        System.out.println("PreDecrement");
        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);
        System.out.println("PostDecrement");
        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}