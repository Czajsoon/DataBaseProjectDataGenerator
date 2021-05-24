package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Worker extends Curse{
    private int ID_kierowcy;
    private String wPlec;
    private String wImie;
    private String wNazwisko;
    private BigDecimal wPESEL;
    private int wWiek;

    public Worker(){
        try{
            PrintWriter zapis = new PrintWriter("Pracownicy.csv");
            for(int i = 0;i<10000; i++){
                ID_kierowcy = i+1;
                wPlec = Plec[random.nextInt(Plec.length)];
                if(wPlec.equals("Mężczyzna")){
                    wImie = m_imiona[random.nextInt(m_imiona.length)];
                    wNazwisko = m_nazwiska[random.nextInt(m_nazwiska.length)];
                }
                else{
                    wImie = d_imiona[random.nextInt(d_imiona.length)];
                    wNazwisko = d_nazwiska[random.nextInt(d_nazwiska.length)];
                }
                wPESEL = new BigDecimal(1000000000 + (i * ID_kierowcy) + 678693);
                wWiek = 18 + random.nextInt(41);
                zapis.println(ID_kierowcy + "," + wImie + "," + wNazwisko + "," + wPESEL + "," + wWiek + "," + wPlec);
            }
            zapis.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("FileNotFound error: " + ex.getMessage());
        }


    }


}
