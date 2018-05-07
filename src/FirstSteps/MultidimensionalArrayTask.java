package FirstSteps;

public class MultidimensionalArrayTask {
    public static void main(String[] args){
        int counter = 0;

        int[][] array = new int[2][3];

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = counter++;
        
        for(int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                System.out.printf("tab[%d][%d] = %d \n", i, j, array[i][j]);

    }
}
