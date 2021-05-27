package Utils;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

import Entities.ConserjeEntity;
public class Utils {

    public void SaveOnConserjeFile(ConserjeEntity conserje) {
        try {
            FileWriter fw = new FileWriter("data\\conserjes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            WriteFile(bw, conserje);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void WriteFile(BufferedWriter bw, ConserjeEntity conserje)
    {
        PrintWriter pw = new PrintWriter(bw);
        pw.print("|" + conserje.getId());
        pw.print("|" + conserje.getDocument());
        pw.print("|" + conserje.getFirstname());
        pw.print("|" + conserje.getLastname());
        pw.close();
    }

    public Vector ViewConserjesFile()
    {
        Vector vector = new Vector();

        try
        {
            FileReader fr = new FileReader("data\\conserjes.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d = br.readLine()) != null)
            {
                StringTokenizer data = new StringTokenizer(d, "|");

                while(data.hasMoreTokens())
                {
                    vector.add(data.nextToken());
                }
                System.out.println(vector);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return vector;
    }
}
