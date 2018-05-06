package FirstSteps;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        String name;
        int age;
        double height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextInt();

        System.out.println("How tall are you? (in meters)");
        height = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height);
    }
}
