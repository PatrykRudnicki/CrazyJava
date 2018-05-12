package ObjectOrientedProgramming.Arrays;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "First name: " + this.firstName + ", last name: " + this.lastName + ", salary: " + this.salary;
    }
}
