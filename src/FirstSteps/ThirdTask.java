package FirstSteps;

public class ThirdTask {
    public static void main(String[] args){

        //String comparison - better method equals
        String string1 = "Patryk";
        String string2 = "Patryk";

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        Double a = 1.0;
        Double b = 2.0;
        Double c = 3.0;

        Double firstResult = (a + b) * c;
        Double secondResult = a - b / c;

        System.out.println(firstResult);
        System.out.println(secondResult);

        a++;
        b++;
        c++;

        System.out.println("a = " + a + " b = " + b + " c = " + c);

        Boolean result1 = (a + b) > c;
        Boolean result2 = a == b;

        System.out.println(result1);
        System.out.println(result2);
    }
}
