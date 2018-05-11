package ObjectOrientedProgramming.Polymorphism;

public class Main {
    public static void main(String[] args){
        FirstInterface firstInterface = new InterfaceImplementation();
        firstInterface.method1();
        ((InterfaceImplementation) firstInterface).method2();
    }
}
