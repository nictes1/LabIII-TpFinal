package Repository;

import Entities.ConserjeEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConserjeRepository extends ConserjeEntity implements Serializable {

    List<ConserjeEntity> listConserje = new ArrayList<>();

    //add a new conserje to the list.
    public void addConserje(ConserjeEntity conserje) {
        listConserje.add(conserje);
    }

    //View list of conserje
    public void viewConserje() {
        System.out.println(listConserje.toString());
    }

    //Deleted conserje if find the conserje's ddni in the list
    public void deleteConserje(String dni) {
        listConserje.removeIf(conserjeEntity -> conserjeEntity.getDocument().equals(dni));
    }

    //returned true or false if find conserje's Dni in the list
    public boolean searchConserjeBOOL(String Dni) {
        for (ConserjeEntity conserje : listConserje) {
            if (conserje.getDocument().equals(Dni)) {
                return true;
            }
        }
        return false;
    }

    //returns an object of type Conserje if find conserje in the list
    public ConserjeEntity searchConserje(String Dni) {
        for (ConserjeEntity conserje : listConserje) {
            if (conserje.getDocument().equals(Dni)) {
                return conserje;
            }
        }
        return null;
    }

    public boolean checkPasword(String dni, String password) {
        ConserjeEntity conserjeEntity = searchConserje(dni);
        if (conserjeEntity != null) {
            if (conserjeEntity.getPassword().equals(password)){
                return true;
            }
        }else{
            System.out.println("could not find the conserje on the list");
        }
        return false;
    }

    public void viewRooms(){

    }
//  public static void main(String[] args) throws IOException, ClassNotFoundException {
//      ConserjeEntity conserjeJuan = new ConserjeEntity("Juan", "Nose", "42488392", "password123");
//      ConserjeEntity conserjeAndres = new ConserjeEntity("Andres", "Nosiewe", "44488392", "password12356");
//      ConserjeEntity conserjeLudmila = new ConserjeEntity("Ludmila", "qwerty", "44488392", "password12356");

//      ListConserje listConserje = new ListConserje();

//      listConserje.addConserje(conserjeJuan);
//      listConserje.addConserje(conserjeAndres);
//      listConserje.addConserje(conserjeLudmila);
//      System.out.println("view");
//      listConserje.viewConserje();
//      System.out.println("termino view");


//  }

}
