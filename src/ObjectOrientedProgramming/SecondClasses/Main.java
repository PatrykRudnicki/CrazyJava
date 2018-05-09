package ObjectOrientedProgramming.SecondClasses;

public class Main {
    public static void main(String[] args){
        int a = 5;
        Test.change(a);
        System.out.println(a);

        Point point = new Point();
        point.x = 5;
        point.y = 5;
        Test.changePoint(point);
        System.out.println("Coordinates: " + point.x + " " + point.y);
    }
}
