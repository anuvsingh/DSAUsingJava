class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is Called...");
    }
}
public class Constructor {
    // Constructor is a special method which is invoked automatically at time of object creation.
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}