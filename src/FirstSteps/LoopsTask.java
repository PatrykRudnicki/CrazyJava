package FirstSteps;

import java.util.Scanner;

public class LoopsTask {
    public static void main(String[] args){
        int limit;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("For what time explosion?");
        limit = scanner.nextInt();

        while(counter < limit){
            System.out.println("Booooom in " + (limit - counter));
            counter++;
        }

        System.out.println("Booooooooooom!!!");

        counter = 0;

        do{
            System.out.println("Booooom in " + (limit - counter));
            counter++;
        } while(counter < limit);

        System.out.println("Booooooooooom!!!");

        for(int i = 0; i < limit; i++){
            System.out.println("Booooom in " + (limit - i));
        }

        System.out.println("Booooooooooom!!!");
    }
}
