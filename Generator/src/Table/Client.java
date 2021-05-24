package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Client extends Curse {
    private int ID_Klienta;
    private String cImie;
    private String cNazwisko;
    private int cWiek;
    private String cPlec;

    public Client(){
        try{
            PrintWriter zapis = new PrintWriter("Klienci.csv");
            for(int i=0;i<30000;i++){
                ID_Klienta = i+1;
                cPlec = Plec[random.nextInt(Plec.length)];
                if(cPlec.equals("Mężczyzna")){
                    cImie = m_imiona[random.nextInt(m_imiona.length)];
                    cNazwisko = m_nazwiska[random.nextInt(m_nazwiska.length)];
                }
                else{
                    cImie = d_imiona[random.nextInt(d_imiona.length)];
                    cNazwisko = d_nazwiska[random.nextInt(d_nazwiska.length)];
                }
                cWiek = 18 + random.nextInt(41);
                zapis.println(ID_Klienta + "," + cImie + "," + cNazwisko + "," + cWiek + "," + cPlec);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FineNotFoundException error: " + ex.getMessage());
        }
    }
}
