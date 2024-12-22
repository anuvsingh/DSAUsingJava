import java.util.Stack;

public class PalindromeLL {
    public static class Node {      // TC and SC = O(n)
        int data;
        Node ptr;
        Node (int d) {
            ptr = null;
            data = d;
        }
    }
    public static boolean isPalindrome (Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack <Integer> s = new Stack<Integer>();
        while (slow != null) {
            s.push(slow.data);
            slow = slow.ptr;
        }
        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.ptr;
        }
        return ispalin;
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean condition = isPalindrome(one);
        System.out.println("Palindrome: " + condition);
    }
}