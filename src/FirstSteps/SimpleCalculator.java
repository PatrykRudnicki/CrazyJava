package FirstSteps;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        double a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        a = scanner.nextDouble();

        System.out.println("Second number:");
        b = scanner.nextDouble();

        System.out.println("Results: ");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
