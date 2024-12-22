import java.util.*;
public class BeautifulArrayList {
    public static void divideConquer (int start, int increment, ArrayList<Integer>res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2*increment, res, n);
        divideConquer(start + increment, 2*increment, res, n);
    }
    public static ArrayList <Integer> beautifulArray (int n) {
        ArrayList<Integer>res = new ArrayList<>();
        divideConquer (1, 1, res, n);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter Size of ArrayList: ");
        int n = sc.nextInt();
        System.out.print("Beautiful ArrayList is ");
        System.out.println(beautifulArray(n));
    }
}