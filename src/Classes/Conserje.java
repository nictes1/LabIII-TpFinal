package Classes;

public class Conserje extends User {
    private String Password;

    public Conserje() {
    }

    public Conserje(String firstname, String lastname, String DNI, String password) {
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

