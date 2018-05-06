package FirstSteps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();

        scanner.close();

        PrintWriter writer = new PrintWriter("materials/test.txt");

        writer.println(name);

        writer.close();

        File file = new File("materials/test.txt");
        Scanner inputFile = new Scanner(file);
        System.out.println(inputFile.nextLine());

        inputFile.close();
    }
}
