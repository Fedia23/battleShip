package model;

import java.util.ArrayList;
import java.util.List;

public class Boards {

    private List<Board> board;

    public Boards(Board board) {

    }

    public List<Board> getBoard() {
        if (board == null) {
            board = new ArrayList<Board>();
        }
        return this.board;
    }
}
