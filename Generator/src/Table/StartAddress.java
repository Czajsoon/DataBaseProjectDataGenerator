package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StartAddress extends Address{
    public StartAddress(){
        try{
            PrintWriter zapis = new PrintWriter("adresy_poczatkowe.csv");
            for(int i=0;i<20000;i++){
                String nazwaulicy = nazwyUlic[random.nextInt(nazwyUlic.length)];
                zapis.println((i+1) + "," + random.nextInt(wojewodztwa.length) + "," + nazwyMiast[random.nextInt(nazwyMiast.length)] + "," + nazwaulicy + "," + (1 + random.nextInt(400)));
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
