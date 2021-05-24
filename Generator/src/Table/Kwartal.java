package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Kwartal extends Date{
    public Kwartal(){
        try{
            PrintWriter zapis = new PrintWriter("kwartaly.csv");
            for(int i=0;i< Kwartaly.length;i++){
                zapis.println((i+1) + "," + Kwartaly[i]);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
