public class TypePromotion {
    public static void main (String args[]) {
    /* 
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));

        //Type promotion is only applicable for the expressions.
        System.out.println(b-a);
        //Type promotion is not applicable for the single characters or values.
        System.out.println(a);
    */

    //1st Rule 
/* 
    short a = 5;
    byte b = 25;
    char c = 'c';
    byte bt = (byte) (a + b + c);
    System.out.println(bt);
*/

    //2nd Rule
    int a = 10;
    float b = 20.25f;
    long c = 25;
    double d = 30;
    // If we write int as place of the double then it lossy conversion error. 
    double ans = a + b + c + d;
    System.out.println(ans);
    }
}
