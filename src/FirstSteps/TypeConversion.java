package FirstSteps;

public class TypeConversion {
    public static void main(String[] args){
        int a = 5;
        double b = 13.5;

        double c = b/a; // Implicit conversion - result type double
        //int c = b/a; // You can't do it

        int d = (int)b/a;
        double e = b/(double)a;

        // Conversions
        // Char to Int
        int f = 'a';
        System.out.println(f);

        // Int to char
        char g = 100;
        System.out.println(g);

        // Double to int
        int h = (int)1.23;
        int i = (int)1.98;
        System.out.println(h);
        System.out.println(i);

        // Int to double
        double j = 1;
        System.out.println(j);
    }
}
