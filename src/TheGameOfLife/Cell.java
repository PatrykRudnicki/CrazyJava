package TheGameOfLife;

public class Cell {
    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public Cell clone() {
        return new Cell(this.alive);
    }

    public void changeState(int neighboursCount) {
        if (this.alive) {
            if (neighboursCount < 2 || neighboursCount > 3) {
                this.alive = false;
            }
        } else {
            if (neighboursCount == 3) {
                this.alive = true;
            }
        }
    }
}
