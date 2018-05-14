package TheGameOfLife;

public class Board {
    private Cell[][] cells;
    private int width;
    private int height;

    public Board(int width, int height) {
        cells = new Cell[width][height];
        this.width = width;
        this.height = height;
        resetAll();
    }

    private void resetAll() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                this.cells[i][j] = new Cell(false);
            }
        }
    }

    public void setCellValue(int x, int y, boolean isAlive) {
        if (x >= 0 && y >= 0 && x < this.width && y < this.height) {
            this.cells[x][y].setAlive(isAlive);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean getCellValue(int x, int y) {
        if (x >= 0 && y >= 0 && x < width && y < height) {
            return cells[x][y].isAlive();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void nextCycle() {
        Cell[][] newBoard = new Cell[this.width][this.height];
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                newBoard[i][j] = this.cells[i][j].clone();
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int neighboursCount = countAliveNeighbours(i, j);
                newBoard[i][j].changeState(neighboursCount);
            }
        }

        cells = newBoard;
    }

    public int countAliveNeighbours(int i, int j) {
        int startX = Math.max(i - 1, 0);
        int startY = Math.max(j - 1, 0);
        int endX = Math.min(i + 1, this.width - 1);
        int endY = Math.min(j + 1, this.height - 1);

        int aliveNeighbours = 0;
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {

                if (this.cells[x][y].isAlive()) {
                    aliveNeighbours++;
                }

            }
        }

        if (cells[i][j].isAlive()) {
            aliveNeighbours--;
        }

        return aliveNeighbours;
    }

    public void printBoard(){
        for(int i = 0; i < this.width; i++){
            for(int j = 0; j < this.height; j++){
                if(this.cells[i][j].isAlive()){
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("\n");
        }
    }
}
