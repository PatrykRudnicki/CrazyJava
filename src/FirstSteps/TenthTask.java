package FirstSteps;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args){
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();

        switch (name) {
            case "Patryk":
                System.out.println("Hello Patryk");
                break;
            case "Bartek":
                System.out.println("Hello Bartek");
                break;
            default:
                System.out.println(name + " I don't know you");

        }
    }
}
