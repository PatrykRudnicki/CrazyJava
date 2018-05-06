package FirstSteps;

public class SecondTask {
    public static void main(String[] args){
        String string1 = "First";
        String string2 = "Second";
        String string3 = "Third";
        String string4 = "Fourth";

        int lengthFirstTwoWords = (string1 + string2).length();
        String everything = string1 + string2 + string3 + string4;

        System.out.println(everything.substring(0, lengthFirstTwoWords));
    }
}
