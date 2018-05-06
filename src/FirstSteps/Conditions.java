package FirstSteps;

public class Conditions {
    public static void main(String[] args){
        int a = 3;

        if(a == 3){
            System.out.println("It's 3");
        } else {
            System.out.println("It's not 3");
        }

        switch (a) {
            case 1:
                System.out.println("It's 1");
                break;
            case 2:
                System.out.println("It's 2");
                break;
            default:
                System.out.println("It's not 1 or 2");
        }
    }
}
