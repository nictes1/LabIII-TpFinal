package Entities;

import java.util.Date;

public class HistoryEntity {
    private Date Period;
    private boolean goodUse;
    private int quantity;
    private RoomEntity Room;

    public HistoryEntity() {
    }

    public HistoryEntity(Date period, boolean goodUse, int quantity, Entities.RoomEntity room) {
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

    public Entities.RoomEntity getRoom() {
        return Room;
    }

    public void setRoom(Entities.RoomEntity room) {
        Room = room;
    }
}