package ObjectOrientedProgramming.Set;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args){
        Set<String> names = new TreeSet<>();
        names.add("Patryk");
        names.add("Patryk");
        names.add("Patryk");
        names.add("Mariusz");
        names.add("Wiktor");
        names.add("Wiktor");

        int namesSize = names.size();
        System.out.println("Number of elements in Set: " + namesSize);
        boolean isPatryk = names.contains("Patryk");
        System.out.println("Is Patryk in set? " + isPatryk);
        for(String x : names)
            System.out.println(x);
    }
}
