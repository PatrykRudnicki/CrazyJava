package ObjectOrientedProgramming.Constructors;

public class Employee {
    String firstName;
    String lastName;
    int age;

    public Employee(String lastName){
        this.firstName = "FirstName";
        this.lastName = lastName;
        this.age = 20;
    }

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 20;
    }

    public Employee(int age){
        this.firstName = "FirstName";
        this.lastName = "LastName";
        this.age = age;
    }

    public Employee(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
