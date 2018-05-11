package ObjectOrientedProgramming.TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanValue {
    public static void main(String[] args){
        int array[] = {1, 2, 3, 4, 5};
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Which element of array you want to see?");
        boolean isCorrect = false;

        while(!isCorrect){
            try {
                index = Integer.parseInt(scanner.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value. Please try again!");
            } catch (IOException e) {
                System.out.println("Error during reading data");
            }
            isCorrect = index == -1 ? false : true;
        }

        try {
            System.out.println("Element with index " + index + " = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect value. Array has " + array.length + " elements.");
        }
    }
}
