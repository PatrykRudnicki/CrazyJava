package FirstSteps;

import java.util.Scanner;

public class ArraySecondTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give size of array: ");

        int n = scanner.nextInt();

        scanner.close();

        int[] arrayOfInts = new int[n];

        for(int i = 0; i < arrayOfInts.length; i++)
            arrayOfInts[i] = i + 1;

        int counter = 0;

        while(counter < arrayOfInts.length){
            System.out.println(arrayOfInts[counter]);
            counter++;
        }
    }
}
