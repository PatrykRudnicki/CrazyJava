package ObjectOrientedProgramming.Arrays;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2){
        if(employee2 == null) return -1;
        if(employee1.getSalary() > employee2.getSalary()) return 1;
        else if(employee1.getSalary() < employee2.getSalary()) return -1;
        else return 0;
    }
}
