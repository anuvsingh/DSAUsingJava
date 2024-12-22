public class primeornot {
    
    public static boolean prime (int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        // True = Number is Prime number.
        // False = Number is Composite number.
        System.out.print(prime(7));
    }
}