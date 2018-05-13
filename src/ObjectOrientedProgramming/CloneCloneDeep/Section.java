package ObjectOrientedProgramming.CloneCloneDeep;

public class Section {
    private Point start;
    private Point end;

    public Section(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart(){
        return this.start;
    }

    public void setStart(Point start){
        this.start = start;
    }

    public Point getEnd(){
        return this.end;
    }

    public void setEnd(Point end){
        this.end = end;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Section(this.start, this.end);
    }
}
