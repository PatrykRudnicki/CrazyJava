package ObjectOrientedProgramming.Inheritance;

public class Doctor extends Employee {
    private double bonus;

    public Doctor(String firstName, String lastName, double salary){
        super(firstName, lastName, salary);
        this.bonus = 0;
    }

    public double getBonus(){
        return this.bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
