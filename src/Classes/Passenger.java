package Classes;

import java.util.UUID;

public class Passenger extends User {
    private String Country, Street;
    private boolean IsOldPassenger, IsActive;
    private UUID IdPassenger;
    private Room Room;

    public Passenger() {
    }

    public Passenger(String firstname, String lastname, String DNI, String country, String street, boolean isOldPassenger, boolean isActive, Classes.Room room) {
        super(firstname, lastname, DNI);
        Country = country;
        Street = street;
        IsOldPassenger = isOldPassenger;
        IsActive = isActive;
        this.IdPassenger = UUID.randomUUID();
        Room = room;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public boolean isOldPassenger() {
        return IsOldPassenger;
    }

    public void setOldPassenger(boolean oldPassenger) {
        IsOldPassenger = oldPassenger;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public UUID getIdPassenger() {
        return IdPassenger;
    }

    public void setIdPassenger(UUID IdPassenger) {
        this.IdPassenger = IdPassenger;
    }

    public Classes.Room getRoom() {
        return Room;
    }

    public void setRoom(Classes.Room room) {
        Room = room;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Country='" + Country + '\'' +
                ", Street='" + Street + '\'' +
                ", IsOldPassenger=" + IsOldPassenger +
                ", IsActive=" + IsActive +
                ", Passenger=" + IdPassenger +
                ", Room=" + Room +
                '}';
    }
}