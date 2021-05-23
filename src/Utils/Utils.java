package Utils;

import java.io.*;
import java.util.List;

public class Utils {

    public File createFile(String nameFile){
        String path = nameFile + ".bin";
        File file = new File(nameFile);
        if(!file.exists()){
            System.out.println("Creating file, please... wait a moment");
            try{
                file.createNewFile();
                System.out.println(file.getName() + "File created..");
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        return file;
    }

    //save list into the file
    public void addListToFile(List<Object> listGeneric, String nameOfFile){
        try{
            OutputStream os = new FileOutputStream(nameOfFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(listGeneric);
            oos.close();
            System.out.println("saved successfully!");

        }catch (Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }

    //view elements of the file
    public void viewFile(String nameOfFile){
        try{
            InputStream is = new FileInputStream(nameOfFile);
            ObjectInputStream ois = new ObjectInputStream(is);

            List<Object> listObj;
            listObj = (List<Object>) ois.readObject();
            System.out.println("----------------------------");
            System.out.println(listObj.toString());
            System.out.println("----------------------------");
        }catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
