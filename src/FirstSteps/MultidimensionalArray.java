package FirstSteps;

public class MultidimensionalArray {
    public static void main(String[] args){
        int[][] array;
        array = new int[3][3];

        int[][] array2 = new int[3][3];

        int[][] array3 = new int[3][];
        array3[0] = new int[3];
        array3[1] = new int[2];
        array3[2] = new int[1];

        // Initialization two dimensional array
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = i + j;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j]);
            System.out.println();
        }
    }
}
