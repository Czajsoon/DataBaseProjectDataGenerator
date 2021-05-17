package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Colors extends Car{
    private int Id_koloru;
    private String nazwaKoloru;

    public Colors(){
        try{
            PrintWriter zapis = new PrintWriter("Kolory.csv");
            for(int i=0;i<Kolory.length;i++){
                Id_koloru = i+1;
                nazwaKoloru = Kolory[i];
                zapis.println(Id_koloru + "," + nazwaKoloru);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException error: " + ex.getMessage());
        }
    }

}
