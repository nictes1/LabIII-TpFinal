package Repository;

import Entities.ConserjeEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConserjeRepository extends ConserjeEntity implements Serializable {

    public static class ListConserje implements Serializable{
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


    }

    public static class FileConserje implements Serializable {

        public void readFile(String nameFile, List<ConserjeEntity> conserjeEntityList) {


            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("N://Workspace//IdeaProjects//LabIII-TpFinal//src//Files//" + nameFile)))) {
                for (int i = 0; i < conserjeEntityList.size(); i++) {
                    out.println(conserjeEntityList);
                }
                out.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            /*try {
                FileReader in = new FileReader("N://Workspace//IdeaProjects//LabIII-TpFinal//src//Files//"+ nameFile);//catch1
                int c = in.read();//catch2
                while(c!=-1){
                    c = in.read();
                    System.out.println(c);
                }

                in.close(); //close file reader

            } catch (FileNotFoundException e) {
                System.out.println("The file could not be found");
                e.printStackTrace();
            } catch (IOException exception) {
                System.out.println();
                exception.printStackTrace();
            }*/

        }

        public void writefile(String nameFile) {

        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConserjeEntity conserjeJuan = new ConserjeEntity("Juan", "Nose", "42488392", "password123");
        ConserjeEntity conserjeAndres = new ConserjeEntity("Andres", "Nosiewe", "44488392", "password12356");
        ConserjeEntity conserjeLudmila = new ConserjeEntity("Ludmila", "qwerty", "44488392", "password12356");

        ListConserje listConserje = new ListConserje();

        listConserje.addConserje(conserjeJuan);
        listConserje.addConserje(conserjeAndres);
        listConserje.addConserje(conserjeLudmila);
        System.out.println("view");
        listConserje.viewConserje();
        System.out.println("termino view");

        FileConserje fileConserje = new FileConserje();

      //FileOutputStream outfile = new FileOutputStream("Conserje.txt");
      //ObjectOutputStream out = new ObjectOutputStream(outfile);

      //out.writeObject(listConserje);
      //out.flush();


        System.out.println("lectura");
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("Conserje.txt"));
        ListConserje listConserje1 = (ListConserje) read.readObject();
        System.out.println("mostrar archivo");
        listConserje1.viewConserje();
        System.out.println("termino de mostrar archivo");


    }

}
