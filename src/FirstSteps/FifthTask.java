package FirstSteps;

import java.math.BigInteger;

public class FifthTask {
    public static void main(String[] args){
        BigInteger a = new BigInteger("-123456789123456789");
        BigInteger b = new BigInteger("987654321987654321");

        System.out.println(a.add(b));
        System.out.println(b.subtract(a));
        System.out.println(a.multiply(b));
        System.out.println(a.pow(2));
        System.out.println(a.pow(3));
    }
}
