package FirstSteps;

public class TestClass {
    public static void main(String[] args){
        int a = 1;
        System.out.println(a); // a = 1

        a++;

        System.out.println(a); // a = 2

        int b = a++;

        System.out.println(b);
        System.out.println(a);

        b++;
        System.out.println(b);

        b++;
        System.out.println(b);

        a = a++;

        System.out.println(a);
    }
}
