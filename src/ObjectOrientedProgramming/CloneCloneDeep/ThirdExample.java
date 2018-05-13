package ObjectOrientedProgramming.CloneCloneDeep;

public class ThirdExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10, 10);

        Section section1 = new Section(p1, p2);
        Section section2 = (Section) section1.clone();

        System.out.println("Comparison: " + (section1 == section2));
        System.out.println("Section1 xStart: " + section1.getStart().getX());
        System.out.println("Section2 xStart: " + section2.getStart().getX());

        section2.getStart().setX(20);
        System.out.println("Section1 xStart: " + section1.getStart().getX());
        System.out.println("Section2 xStart: " + section2.getStart().getX());
    }
}
