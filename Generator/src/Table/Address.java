package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Address extends Trip{
    public Address(){
        try{
            PrintWriter zapis = new PrintWriter("adresy.csv");
            for(int i=0;i<20000;i++){
                zapis.println((i+1) + "," + (1 + random.nextInt(20000) + "," + (1 + random.nextInt(20000))));
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
