package FirstSteps;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args){
        BigInteger bigNumber1 = new BigInteger("12312312312312312312");
        System.out.println(bigNumber1);

        BigInteger bigNumber2 = BigInteger.valueOf(123123);
        System.out.println(bigNumber2);

        System.out.println(bigNumber1.add(bigNumber2));
    }
}
