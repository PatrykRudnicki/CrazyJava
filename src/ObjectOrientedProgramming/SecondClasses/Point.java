package ObjectOrientedProgramming.SecondClasses;

public class Point {
    int x;
    int y;

    void increaseX(){
        this.x++;
    }

    void increaseY(){
        this.y++;
    }

    void setX(int x){
        this.x = x;
    }

    void setY(int y){
        this.y = y;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    void show(){
        System.out.println("Coordinates of point: " + this.x + " " + this.y);
    }
}
