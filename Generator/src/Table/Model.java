package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Model extends Brand{
    private int Id_modelu;
    private String NazwaModelu;

    public Model(){
        try{
            PrintWriter zapis = new PrintWriter("modele.csv");
            int id = 1;
            for(int i=0;i<Mercedesy.length;i++){
                Id_modelu = id;
                NazwaModelu = Mercedesy[i];
                zapis.println(Id_modelu + "," + NazwaModelu);
                id++;
            }
            for(int i=0;i< Skody.length;i++){
                Id_modelu = id;
                NazwaModelu = Skody[i];
                zapis.println(Id_modelu + "," + NazwaModelu);
                id++;
            }
            for(int i=0;i< Citroeny.length;i++){
                Id_modelu = id;
                NazwaModelu = Citroeny[i];
                zapis.println(Id_modelu + "," + NazwaModelu);
                id++;
            }
            for(int i=0;i< Mitsubishi.length;i++){
                Id_modelu = id;
                NazwaModelu = Mitsubishi[i];
                zapis.println(Id_modelu + "," + NazwaModelu);
                id++;
            }
            zapis.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
