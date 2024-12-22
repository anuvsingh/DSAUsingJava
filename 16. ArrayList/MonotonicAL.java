import java.util.*;
public class MonotonicAL {
    public static boolean isMonotonic (ArrayList<Integer>A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size()-1; i++) {
            if (A.get(i) > A.get(i+1)) {
                inc = false;
            }
            if (A.get(i) < A.get(i+1)) {
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter no. of Elements in List: "); 
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        for (int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Given ArrayList is Monotonic. - ");
        System.out.println(isMonotonic(list));
    }
}
