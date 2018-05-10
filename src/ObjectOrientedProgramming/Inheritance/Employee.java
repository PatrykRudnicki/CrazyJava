package ObjectOrientedProgramming.Inheritance;

public class Employee {
    String firstName;
    String lastName;
    int salary;

    public Employee(){
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
    }

    public Employee(String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
