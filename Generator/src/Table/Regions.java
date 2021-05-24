package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Regions extends EndAddress{
    public Regions(){
        try{
            PrintWriter zapis = new PrintWriter("wojewodztwa.csv");
            for(int i=0;i< wojewodztwa.length;i++){
                zapis.println((i+1) + "," + wojewodztwa[i]);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
