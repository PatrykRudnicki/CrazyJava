package TheGameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    public void testCreate() {
        int width = 10;
        int height = 10;
        Board board = new Board(width, height);
        assertNotNull(board);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                assertEquals(false, board.getCellValue(i, j));
        }
    }

    @Test
    public void testSetValue() {
        Board board = new Board(10, 10);
        board.setCellValue(5, 5, true);
        assertEquals(true, board.getCellValue(5, 5));

        board.setCellValue(0, 0, true);
        assertEquals(true, board.getCellValue(0, 0));

        board.setCellValue(0, 1, true);
        assertEquals(true, board.getCellValue(0, 1));

        board.setCellValue(1, 0, true);
        assertEquals(true, board.getCellValue(1, 0));

        board.setCellValue(1, 1, true);
        assertEquals(true, board.getCellValue(1, 1));
    }

    @Test
    public void testDieLonely() {
        Board board = new Board(5, 5);
        board.setCellValue(0, 0, true);
        assertEquals(0, board.countAliveNeighbours(0, 0));
        board.nextCycle();
        assertEquals(false, board.getCellValue(0, 0));

        Board board2 = new Board(5, 5);
        board2.setCellValue(0, 0, true);
        board2.setCellValue(0, 1, true);
        assertEquals(1, board2.countAliveNeighbours(0, 0));
        board2.nextCycle();
        assertEquals(false, board2.getCellValue(0, 0));
    }

    @Test
    public void testSurvive() {
        Board board2 = new Board(5, 5);
        board2.setCellValue(0, 0, true);
        board2.setCellValue(0, 1, true);
        board2.setCellValue(1, 0, true);
        assertEquals(2, board2.countAliveNeighbours(0, 0));
        board2.nextCycle();
        assertEquals(true, board2.getCellValue(0, 0));

        Board board3 = new Board(5, 5);
        board3.setCellValue(0, 0, true);
        board3.setCellValue(0, 1, true);
        board3.setCellValue(1, 0, true);
        board3.setCellValue(1, 1, true);
        assertEquals(3, board3.countAliveNeighbours(0, 0));
        board3.nextCycle();
        assertEquals(true, board3.getCellValue(0, 0));
    }

    @Test
    public void testDieOverpopulation() {
        Board board = new Board(5, 5);
        board.setCellValue(2, 2, true);
        board.setCellValue(2, 1, true);
        board.setCellValue(2, 3, true);
        board.setCellValue(1, 2, true);
        board.setCellValue(3, 2, true);
        assertEquals(4, board.countAliveNeighbours(2, 2));
        board.nextCycle();
        assertEquals(false, board.getCellValue(2, 2));
    }

    @Test
    public void testRessurection() {
        Board board = new Board(5, 5);
        board.setCellValue(2, 2, false);
        board.setCellValue(2, 1, true);
        board.setCellValue(2, 3, true);
        board.setCellValue(1, 2, true);
        assertEquals(3, board.countAliveNeighbours(2, 2));
        board.nextCycle();
        assertEquals(true, board.getCellValue(2, 2));
    }
}