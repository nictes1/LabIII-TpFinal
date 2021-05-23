package Entities;

public class ConserjeEntity extends UserEntity {
    private String Password;

    public ConserjeEntity() {
    }

    public ConserjeEntity(String firstname, String lastname, String DNI, String password) {
        super(firstname, lastname, DNI);
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}

