package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Car extends Generator{
    private int Id_pojazdu;
    private int ID_typu;
    private int Id_kolor;
    private int Id_fuelType;
    private int Id_barnd;
    private int Id_drive;
    private int Id_places;

    public Car(){
        try{
            PrintWriter zapis = new PrintWriter("samochody.csv");
            for(int i=0;i<2000;i++){
                Id_pojazdu = i+1;
                ID_typu = 1 + random.nextInt(CarTypes.length);
                Id_kolor = 1 + random.nextInt(Kolory.length);
                Id_fuelType = 1 + random.nextInt(Paliwa.length);
                Id_barnd = 1 + random.nextInt(24);
                Id_drive = 1 + random.nextInt(Napedy.length);
                Id_places = 1 + random.nextInt(iloscMiejsc.length);
                zapis.println(Id_pojazdu + "," + ID_typu + "," + Id_kolor + "," + Id_fuelType + "," + Id_barnd + "," + Id_drive + "," + Id_places);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
