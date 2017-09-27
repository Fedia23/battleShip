package model;

public class Game {

    private int boardSize;
    private Boards boards;

    public Game (int boardSize) {
        setBoardSize(boardSize);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public Boards buildBoards() {
        return new Boards();
    }


}
