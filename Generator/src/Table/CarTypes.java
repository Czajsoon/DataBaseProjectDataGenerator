package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CarTypes extends Car{
    private int Id_typu;
    private String nazwa;

    public CarTypes(){
        try{
            PrintWriter zapis = new PrintWriter("Typy_nadwozia.csv");
            for(int i =0; i<CarTypes.length;i++){
                Id_typu = i+1;
                nazwa = CarTypes[i];
                zapis.println(Id_typu + "," + nazwa);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
