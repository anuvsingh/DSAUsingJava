class Person {
    String name;
    String address;

    // Shallow copy constructor
    public Person(Person person) {
        if (person != null) {
            this.name = person.name;
            this.address = person.address;
            // Shallow copy of address object
        }
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Person person1 = new Person(null);
        person1.name = "John";
        person1.address = "123 Main St";

        // Creating a shallow copy of person1
        Person person2 = new Person(person1);

        // Displaying the details of person1 and person2
        System.out.println("Person 1 Name: " + person1.name);
        System.out.println("Person 1 Address: " + person1.address);
        System.out.println("Person 2 Name: " + person2.name);
        System.out.println("Person 2 Address: " + person2.address);

        // Modifying the address of person2
        person2.address = "456 Elm St";

        // Displaying the details again to show the effect of shallow copy
        System.out.println("After modifying person2's address:");
        System.out.println("Person 1 Address: " + person1.address);
        System.out.println("Person 2 Address: " + person2.address);
    }
}