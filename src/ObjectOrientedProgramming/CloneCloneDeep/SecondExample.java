package ObjectOrientedProgramming.CloneCloneDeep;

public class SecondExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(10, 10);
        Point point2 = (Point) point1.clone();
        Point point3 = new Point(10, 10);

        System.out.println("Comparison 1: " + (point1 == point2));
        System.out.println("Comparison 2: " + (point1 == point3));

        show(point1, point2, point3);

        point2.setX(11);
        point3.setX(12);

        show(point1, point2, point3);
    }

    public static void show(Point... points) {
        for(int i = 0; i < points.length; i++)
            System.out.println("Point " + i + " x:" + points[i].getX() + " ; y:" + points[i].getY());
    }
}
