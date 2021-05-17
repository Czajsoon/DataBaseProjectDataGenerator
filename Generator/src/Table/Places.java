package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Places extends Car{
    private int ID_miejsc;
    private int ilosc_Miejsc;

    public Places(){
        try{
            PrintWriter zapis = new PrintWriter("ilościMiejsc.csv");
            for(int i=0;i< iloscMiejsc.length;i++){
                ID_miejsc = i+1;
                ilosc_Miejsc = iloscMiejsc[i];
                zapis.println(ID_miejsc + ',' + ilosc_Miejsc);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
