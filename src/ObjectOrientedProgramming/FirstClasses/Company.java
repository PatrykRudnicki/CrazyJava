package ObjectOrientedProgramming.FirstClasses;

public class Company {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];

        String[] names = {"John", "Kate", "George"};
        String[] lastNames = {"Fround", "Lurge", "Monnfs"};
        int[] ages = {20, 25, 30};

        for(int i = 0; i < employees.length; i++){
            employees[i] = new Employee();
            employees[i].firstName = names[i];
            employees[i].lastName = lastNames[i];
            employees[i].age = ages[i];
        }

        for(int i = 0; i < employees.length; i++){
            System.out.println("Employee No. " + (i + 1) + " " + employees[i].firstName + " " + employees[i].lastName +
                    " " + employees[i].age);
        }
    }
}
