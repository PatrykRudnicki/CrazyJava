package FirstSteps;

import java.util.Scanner;

public class ArrayFirstTask {
    public static void main(String[] args){
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type five names. Press enter every name");

        for(int i = 0; i < names.length; i++)
            names[i] = scanner.nextLine();

        scanner.close();

        for(int i = 0; i < names.length; i++)
            System.out.println("Hello " + names[i]);
    }
}
