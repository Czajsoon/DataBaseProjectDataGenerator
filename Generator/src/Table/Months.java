package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Months extends Date{
    public Months(){
        try{
            PrintWriter zapis = new PrintWriter("months.csv");
            for(int i=0;i< nazwyMiesiacy.length;i++){
                zapis.println((i+1) + "," + nazwyMiesiacy[i]);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
