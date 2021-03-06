package ObjectOrientedProgramming.Constructors;

public class Point {
    int x;
    int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }
}
