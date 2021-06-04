package Entities;

import java.util.UUID;

public class PassengerEntity extends UserEntity {
    private String Country, Street;
    private boolean IsOldPassenger, IsActive;
    private UUID IdPassenger;
    private RoomEntity Room;

    public PassengerEntity() {
    }

    public PassengerEntity(String firstname, String lastname, String DNI, String country, String street, boolean isOldPassenger, boolean isActive) {
        super(firstname, lastname, DNI);
        Country = country;
        Street = street;
        IsOldPassenger = isOldPassenger;
        IsActive = isActive;
        this.IdPassenger = UUID.randomUUID();
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


    @Override
    public String toString() {
        return "Passenger{" +
                "Country='" + Country + '\'' +
                ", Street='" + Street + '\'' +
                ", IsOldPassenger=" + IsOldPassenger +
                ", IsActive=" + IsActive +
                ", Passenger=" + IdPassenger +
                '}';
    }
}