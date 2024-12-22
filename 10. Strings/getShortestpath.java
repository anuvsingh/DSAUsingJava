import java.util.Scanner;

public class getShortestpath {

    public static float displacement (String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // SOUTH
            if (direction == 'S') {
                y--;
            }
            // NORTH
            else if (direction == 'N') {
                y++;
            }
            // WEST
            else if (direction == 'W') {
                x--;
            }
            // EAST
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter Directions (N/S/E/W): ");
            String dir = sc.nextLine();
            System.out.print("Shortest Path is: " + displacement(dir));
        }
}