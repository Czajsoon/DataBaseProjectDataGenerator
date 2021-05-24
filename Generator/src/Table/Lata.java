package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lata extends Date{
    public Lata(){
        try{
            PrintWriter zapis = new PrintWriter("lata.csv");
            for(int i=0;i< rok.length;i++){
                zapis.println((i+1) + "," + rok[i]);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
