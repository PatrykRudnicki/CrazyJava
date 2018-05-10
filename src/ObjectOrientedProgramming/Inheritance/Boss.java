package ObjectOrientedProgramming.Inheritance;

public class Boss extends Employee {
    double bonus;

    public Boss(String firstName, String lastName, double salary, double bonus){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = bonus;
    }
}
