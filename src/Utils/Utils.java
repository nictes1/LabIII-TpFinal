package Utils;

import java.io.*;
import java.util.List;

public class Utils {

    //Implement.
    //Utils utils = new Utils();
    //utils.WriteFile();
    public void WriteFile(String nameFile){ //only files with extension ".txt"
        FileWriter file = null;
        PrintWriter printeWriter = null;
        try
        {
            file = new FileWriter("N://Workspace//IdeaProjects//LabIII-TpFinal//src//Files//"+nameFile+".txt");
            printeWriter = new PrintWriter(file);

            for (int i = 0; i < 10; i++)
                printeWriter.println("line " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != file)
                    file.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    //view elements of the file
    public void viewFile(String nameFile){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufreader = null;

        try {
            //open file, and creating the new bufferreader for can do the lecture
            file = new File ("N://Workspace//IdeaProjects//LabIII-TpFinal//src//Files//"+nameFile+".txt");
            fileReader = new FileReader (file);
            bufreader = new BufferedReader(fileReader);

            //lecture the file
            String line;
            while((line = bufreader.readLine())!=null)
                System.out.println(line);
        }
        catch(Exception e1){
            e1.printStackTrace();
        }finally{
            try{
                //close the file, checked this with try/cath
                if( null != fileReader ){
                    fileReader.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
