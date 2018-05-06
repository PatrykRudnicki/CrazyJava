package FirstSteps;

import static java.lang.Math.*;

public class MathFunctions {
    public static void main(String[] args){
        double a = 9.0;
        int b = 3;

        // Without import static Math.sqrt
        double sqr = sqrt(a);
        System.out.println(sqr);

        // Without import static Math.pow
        double pow = pow(a, b);
        System.out.println(pow);

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
