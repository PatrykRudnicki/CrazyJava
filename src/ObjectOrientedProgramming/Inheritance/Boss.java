package ObjectOrientedProgramming.Inheritance;

public class Boss extends Employee {
    int bonus;

    public Boss(String firstName, String lastName, int salary, int bonus){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = bonus;
    }
}
