package ObjectOrientedProgramming.FirstClasses;

public class SetPoint {
    public static void main(String[] args){
        Point point = new Point();
        point.setX(10);
        point.setY(20);
        System.out.println("Coordinates of the point are: " + point.getX() + ", " + point.getY());
    }
}
