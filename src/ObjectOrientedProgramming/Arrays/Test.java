package ObjectOrientedProgramming.Arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Employee michal = new Employee("Michal", "Granastowlosy", 8000);
        Employee dominik = new Employee("Dominik", "Krzywousty", 7900);
        Employee pawel = new Employee("Pawel", "Mruszczyk", 6700);
        Employee wiktor = new Employee("Wiktor", "Brander", 10000);

        Employee[] employees = {michal, dominik, pawel, wiktor};
        EmployeeComparator employeeComparator = new EmployeeComparator();
        Arrays.sort(employees, employeeComparator);
        show(employees);
    }

    public static void show(Employee[] employees) {
        for(Employee employee : employees)
            System.out.println(employee);
    }
}
