package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Curse extends Generator{
    public Curse(){
        try{
            PrintWriter zapis = new PrintWriter("courses.csv");
            for(int i=0;i<100000;i++){
                int idWorker = 1 + random.nextInt(10000);
                int idClient = 1 + random.nextInt(30000);
                int idData = 1 + random.nextInt(100000);
                int idCar = 1 + random.nextInt(2000);
                int idTrip = 1 + random.nextInt(200000);
                zapis.println((i+1) + "," + idWorker + "," + idClient + "," + idData + "," + idCar + "," + idTrip);
            }
            zapis.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
