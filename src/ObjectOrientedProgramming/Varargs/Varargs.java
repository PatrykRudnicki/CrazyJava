package ObjectOrientedProgramming.Varargs;

public class Varargs {
    public static int sum(int arg0, int...args){
        int result = arg0;

        for(int i : args)
            result += i;

        return result;
    }
}
