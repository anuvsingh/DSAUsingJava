class Student{
    String name;
    int roll;
    Student() {     //Non-parameterized
        System.out.println("Constructor is Called...");
    }
    Student(String name){   //Parameterized
        this.name = name;
    }
    Student(int roll){      //Parameterized
        this.roll = roll;
    }
}
public class TypesOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anubhav");
        System.out.println("Student name: " + s2.name);
        Student s3 = new Student(210801);
        System.out.println("Student roll: " + s3.roll);
    }
}