package Entities;

import Enums.RoomStatus;

import java.util.Date;

public class RoomEntity{
    private int idRoom;
    private Date period;
    private Enums.RoomStatus roomStatus;

    public RoomEntity(int idRoom, Date period, RoomStatus roomStatus) {
        this.idRoom = idRoom;
        this.period = period;
        this.roomStatus = roomStatus;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }


}

