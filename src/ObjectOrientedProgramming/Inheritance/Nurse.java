package ObjectOrientedProgramming.Inheritance;

public class Nurse extends Employee {
    private int overtime;

    public Nurse(String firstName, String lastName, double salary){
        super(firstName, lastName, salary);
        this.overtime = 0;
    }

    public int getOvertime(){
        return this.overtime;
    }

    public void addOvertime(int newOvertime){
        this.overtime += newOvertime;
    }
}
