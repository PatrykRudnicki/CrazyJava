package ObjectOrientedProgramming.Inheritance;

public class Test {
    public static void main(String[] args){
        Point3D[] points = new Point3D[4];
        Point2D point2D = new Point2D(10,20);

        for(int i = 0; i < points.length; i++){
            if(i == 0) points[i] = new Point3D();
            else if(i == 1) points[i] = new Point3D(10);
            else if(i == 2) points[i] = new Point3D(point2D);
            else points[i] = new Point3D(point2D, 10);
        }

        for(Point3D point : points)
            System.out.println("Coordinates: x: " + point.x + " y: " + point.y + " z: " + point.z);
    }
}
