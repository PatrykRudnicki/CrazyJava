package FirstSteps;

public class ForEachLoop {
    public static void main(String[] args){
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++)
            array[i] = i + 1;

        for(int x : array)
            System.out.println(x);
    }
}
