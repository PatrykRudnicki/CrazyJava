package ObjectOrientedProgramming.Exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws ArithmeticException {
        int x=10;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set divider: ");
        y = scanner.nextInt();
        scanner.close();
        if(y == 0)
            throw new ArithmeticException("You can't divide by 0");
        else
            System.out.println(x/(double)y);
    }
}
