package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Brand extends Car{
    private int Id_Brnad;
    private int model_id;
    private String nazwa;

    public Brand(){
        try{
            PrintWriter zapis = new PrintWriter("Marki.csv");
            int id =1;
            for(int i=0;i< Marki.length;i++){
                nazwa = Marki[i];
                switch (nazwa){
                    case "Mercedes":{
                        for(int j=0;j<5;j++){
                            Id_Brnad = id;
                            model_id = j + 1;
                            zapis.println(Id_Brnad + "," + model_id + "," + nazwa);
                            id++;
                        }
                        break;
                    }
                    case "Skoda":{
                        for(int j=5;j<14;j++){
                            Id_Brnad = id;
                            model_id = j + 1;
                            zapis.println(Id_Brnad + "," + model_id + "," + nazwa);
                            id++;
                        }
                        break;
                    }
                    case "Citroen":{
                        for(int j=14;j<18;j++){
                            Id_Brnad = id;
                            model_id = j + 1;
                            zapis.println(Id_Brnad + "," + model_id + "," + nazwa);
                            id++;
                        }
                        break;
                    }
                    case "Mitsubishi":{
                        for(int j=18;j<24;j++){
                            Id_Brnad = id;
                            model_id = j+1;
                            zapis.println(Id_Brnad + "," + model_id + "," + nazwa);
                            id++;
                        }
                        break;
                    }
                }
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FNF error: " + ex.getMessage());
        }
    }
}
