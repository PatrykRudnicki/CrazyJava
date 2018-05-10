package ObjectOrientedProgramming.Inheritance;

public class Point3D extends Point2D {
    int z;

    public Point3D(){
        this.z = 0;
    }

    public Point3D(int z){
        this.z = 0;
    }

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point2D point2D){
        this.x = point2D.x;
        this.y = point2D.y;
        this.z = 0;
    }

    public Point3D(Point2D point2D, int z){
        this.x = point2D.x;
        this.y = point2D.y;
        this.z = z;
    }
}
