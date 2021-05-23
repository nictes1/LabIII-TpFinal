package Classes;

import java.util.UUID;

public abstract class User {
    private UUID id;
    private String Firstname, Lastname, DNI;

    public User() {
    }

    public User(String firstname, String lastname, String DNI) {
        this.id = UUID.randomUUID();
        Firstname = firstname;
        Lastname = lastname;
        this.DNI = DNI;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
