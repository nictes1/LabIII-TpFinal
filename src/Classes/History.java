package Classes;

import java.util.Date;

public class History {
    private Date Period;
    private boolean goodUse;
    private int quantity;
    private Room Room;

    public History() {
    }

    public History(Date period, boolean goodUse, int quantity, Classes.Room room) {
        Period = period;
        this.goodUse = goodUse;
        this.quantity = quantity;
        Room = room;
    }

    public Date getPeriod() {
        return Period;
    }

    public void setPeriod(Date period) {
        Period = period;
    }

    public boolean isGoodUse() {
        return goodUse;
    }

    public void setGoodUse(boolean goodUse) {
        this.goodUse = goodUse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Classes.Room getRoom() {
        return Room;
    }

    public void setRoom(Classes.Room room) {
        Room = room;
    }
}