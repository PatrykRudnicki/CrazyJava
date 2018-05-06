package FirstSteps;

import java.util.Scanner;

public class NinethTask {
    public static void main(String[] args){
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        a = scanner.nextInt();

        System.out.println("Second number:");
        b = scanner.nextInt();

        if(a == b){
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " isn't equal to " + b);
        }
    }
}
