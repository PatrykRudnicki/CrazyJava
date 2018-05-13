package ObjectOrientedProgramming.Random;

import java.util.LinkedList;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args){
        LinkedList listDouble = new LinkedList();
        LinkedList listInt = new LinkedList();
        LinkedList listIntDefined = new LinkedList();
        LinkedList listFloat = new LinkedList();
        LinkedList listBoolen = new LinkedList();
        Random random = new Random();

        for(int i = 0; i < 30; i++)
            listDouble.add(random.nextDouble() * 100);

        for(int i = 0; i < 30; i++)
            listInt.add(random.nextInt());

        for(int i = 0; i < 30; i++)
            listIntDefined.add(random.nextInt(50));

        for(int i = 0; i < 30; i++)
            listFloat.add(random.nextFloat());

        for(int i = 0; i < 10; i++)
            listBoolen.add(random.nextBoolean());
    }
}
