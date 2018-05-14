package TheGameOfLife;

import java.util.Random;

public class TheGameOfLife {
    public static void main(String[] args) throws InterruptedException {
        int width = 20;
        int height = 20;
        Board board = new Board(width, height);
        Random random = new Random();
        for(int i = 0; i < 50; i++){
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            board.setCellValue(x, y, true);
        }

        for(int i = 0; i < 10; i++){
            board.printBoard();
            board.nextCycle();
            System.out.println();
            System.out.println();
            System.out.println();
            Thread.sleep(1000L);
        }
    }
}
