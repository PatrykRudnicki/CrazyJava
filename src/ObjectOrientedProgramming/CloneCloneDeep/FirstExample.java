package ObjectOrientedProgramming.CloneCloneDeep;

public class FirstExample {
    public static void main(String[] args){
        Point point1 = new Point(10, 10);
        Point point2 = point1;
        Point point3 = new Point(10, 10);

        System.out.println("Comparison 1: " + (point1 == point2));
        System.out.println("Comparison 2: " + (point1 == point3));

        show(point1, point2, point3);

        point2.setX(11);
        point3.setX(12);

        show(point1, point2, point3);

        // Simple solution for that problem below
        Point point4 = new Point(20, 20);
        Point point5 = new Point(point4.getX(), point4.getY());

        System.out.println("Comparison 3: " + (point4 == point5));
    }

    public static void show(Point... points) {
        for(int i = 0; i < points.length; i++)
            System.out.println("Point " + i + " x:" + points[i].getX() + " ; y:" + points[i].getY());
    }
}
