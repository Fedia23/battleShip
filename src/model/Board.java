package model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Ship> ship;

    public Board(Position position) {

    }

    public List<Ship> getShip() {
        if (ship == null) {
            ship = new ArrayList<Ship>();
        }
        return this.ship;
    }
}
