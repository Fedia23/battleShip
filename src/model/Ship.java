package model;

public class Ship {

    private String shipId;
    private Position shipPosition;

    public Ship() {

    }

    public String getShipId() {
        return shipId;
    }

    public Position getShipPosition() {
        return shipPosition;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public void setShipPosition(Position shipPosition) {
        this.shipPosition = shipPosition;
    }
}
