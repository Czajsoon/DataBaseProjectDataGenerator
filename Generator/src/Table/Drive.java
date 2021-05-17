package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Drive extends Car{
    private int ID_drive;
    private String nazwa;

    public Drive() {
        try {
            PrintWriter zapis = new PrintWriter("Napedy.csv");
            for (int i=0;i<Napedy.length;i++){
                ID_drive = i+1;
                nazwa = Napedy[i];
                zapis.println(ID_drive + "," + nazwa);
            }
            zapis.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
