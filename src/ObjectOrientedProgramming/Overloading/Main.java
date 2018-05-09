package ObjectOrientedProgramming.Overloading;

public class Main {
    public static void main(String[] args){
        String a = "a";
        String b = "b";
        int c = 1;
        int d = 1;
        double e = 2.0;
        double f = 2.0;
        long g = 3;
        long h = 3;

        System.out.println(OverloadedMethods.add(a, b));
        System.out.println(OverloadedMethods.add(c, d));
        System.out.println(OverloadedMethods.add(e, f));
        System.out.println(OverloadedMethods.add(g, h));
    }
}
