package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Trip extends Curse{
    public Trip(){
        int forKM = 4;

        try{
            PrintWriter zapis = new PrintWriter("Trasa.csv");
            for(int i=0;i<200000;i++){
                int kilometersTrip = 4 + random.nextInt(600);
                int costTrip = forKM * kilometersTrip;
                zapis.println((i+1) + "," + random.nextInt(20000) + "," + kilometersTrip + "," + costTrip);
            }
            zapis.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }



    }
}
