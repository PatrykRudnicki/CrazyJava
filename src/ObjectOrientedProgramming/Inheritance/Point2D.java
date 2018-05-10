package ObjectOrientedProgramming.Inheritance;

public class Point2D {
    int x;
    int y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x){
        this.x = x;
        this.y = x;
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
}
