package ObjectOrientedProgramming.Constructors;

public class Company {
    public static void main(String[] args){
        Employee[] employees = new Employee[4];

        for(int i = 0; i < employees.length; i++){
            if(i == 0) employees[i] = new Employee("Rudnicki");
            else if(i == 1) employees[i] = new Employee("Patryk", "Rudnicki");
            else if(i == 2) employees[i] = new Employee("Patryk", "Rudnicki", 25);
            else employees[i] = new Employee(25);
        }

        for(Employee x : employees)
            System.out.println("First name: " + x.firstName + ". Last name: " + x.lastName + ". Age: " + x.age);
    }
}
