package FirstSteps;

public class Loops {
    public static void main(String[] args){
        int counter = 0;

        while(counter < 10){
            System.out.println("You're inside loop");
            counter++;
        }

        System.out.println("Loop finished");

        counter = 0;
        do{
            System.out.println("You're inside loop");
            counter++;
        } while(counter < 10);

        System.out.println("Loop finished");

        for(int i = 0; i < 10; i++){
            System.out.println("You're inside loop");
        }

        System.out.println("Loop finished");
    }
}
