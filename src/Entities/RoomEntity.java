package Entities;

import java.util.Date;
import java.util.UUID;

public class RoomEntity {
    private UUID idRoom;
    private boolean avilability;
    private int quantity;
    private Date period;
    private String Motive;

    public RoomEntity() {
    }

    public RoomEntity(boolean avilability, int quantity, Date period, String motive) {
        this.idRoom = UUID.randomUUID();
        this.avilability = avilability;
        this.quantity = quantity;
        this.period = period;
        Motive = motive;
    }

    public boolean isAvilability() {
        return avilability;
    }

    public void setAvilability(boolean avilability) {
        this.avilability = avilability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getMotive() {
        return Motive;
    }

    public void setMotive(String motive) {
        Motive = motive;
    }

    @Override
    public String toString() {
        return "Room{" +
                "avilability=" + avilability +
                ", quantity=" + quantity +
                ", period=" + period +
                ", Motive='" + Motive + '\'' +
                '}';
    }
}

