class Address {
    String city;

    // Constructor to initialize city
    public Address(String city) {
        this.city = city;
    }

    // Copy constructor for deep copy
    public Address(Address address) {
        this.city = address.city;
    }
}

class Person {
    String name;
    Address address;

    // Constructor to initialize name and address
    public Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Deep copy of Address
    }

    // Copy constructor for deep copy
    public Person(Person person) {
        if (person != null) {
            this.name = person.name;
            this.address = new Address(person.address); // Deep copy of address object
        }
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Address address1 = new Address("New York");
        Person person1 = new Person("John", address1);

        // Creating a deep copy of person1
        Person person2 = new Person(person1);

        // Modifying the address of person2
        person2.address.city = "Los Angeles";

        // Printing the addresses to verify deep copy
        System.out.println("Person 1 Address: " + person1.address.city); // Should print "New York"
        System.out.println("Person 2 Address: " + person2.address.city); // Should print "Los Angeles"
    }
}