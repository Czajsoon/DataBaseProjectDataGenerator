package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FuelTypes extends Car{
    private int ID_paliwa;
    private String nazwa;

    public FuelTypes(){
        try{
            PrintWriter zapis = new PrintWriter("FuelTypes.csv");
            for(int i=0;i<Paliwa.length;i++){
                ID_paliwa = i+1;
                nazwa = Paliwa[i];
                zapis.println(ID_paliwa + "," + nazwa);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
