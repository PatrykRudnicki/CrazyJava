package ObjectOrientedProgramming.AbstractClasses;

public abstract class Pensioner {
    public static final int NUMBER_OF_EYES = 2;

    public abstract String shoutAtChildren();

    public static void goToShop(int distance, int speed){
        double czas = (double)distance/speed;
        System.out.println("I'm running for sausage. I'll be in "+ czas);
    }
}
