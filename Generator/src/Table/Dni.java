package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Dni extends Date{
    public Dni(){
        try{
            PrintWriter zapis = new PrintWriter("dni.csv");
            for(int i=0;i< nazwyDni.length;i++){
                zapis.println((1+i) + "," + nazwyDni[i]);
            }
            zapis.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
