package Table;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Date extends Curse{
    private String date;
    private int numerDnia;

    public Date(){

        try{
            PrintWriter zapis = new PrintWriter("daty.csv");
            for(int i=0;i<100000;i++){
                int year = rok[random.nextInt(rok.length)];
                int month = 1 + random.nextInt(nazwyMiesiacy.length);

                if(month == 1 || month == 3 || month == 5
                        || month == 7 || month == 8 || month == 10
                        || month == 12){
                    numerDnia = 1 + random.nextInt(31);
                }
                else if(month == 4 || month == 6 || month == 9 || month == 11){
                    numerDnia = 1 + random.nextInt(30);
                }
                else{
                    if(year%4 != 0)
                        numerDnia = 1 + random.nextInt(28);
                    else
                        numerDnia = 1 + random.nextInt(29);
                }

                int kwartal = 0;
                if(month > 0 && month <= 3)
                    kwartal = 1;
                else if(month >= 4 && month <= 6)
                    kwartal = 2;
                else if(month >= 7 && month <= 8)
                    kwartal = 3;
                else if(month >= 9 && month <= 12)
                    kwartal = 4;

                int nazwaDnia = 1 + random.nextInt(nazwyDni.length);

                if(month<10)
                    date = year + "/0" + month + "/" + numerDnia;
                else
                    date = year + "/" + month + "/" + numerDnia;

                int idYear = 0;
                switch (year){
                    case 2000:idYear = 1;break;
                    case 2001:idYear = 2;break;
                    case 2002:idYear = 3;break;
                    case 2003:idYear = 4;break;
                    case 2004:idYear = 5;break;
                    case 2005:idYear = 6;break;
                    case 2006:idYear = 7;break;
                    case 2007:idYear = 8;break;
                    case 2008:idYear = 9;break;
                    case 2009:idYear = 10;break;
                    case 2010:idYear = 11;break;
                    case 2011:idYear = 12;break;
                    case 2012:idYear = 13;break;
                    case 2013:idYear = 14;break;
                    case 2014:idYear = 15;break;
                    case 2015:idYear = 16;break;
                    case 2016:idYear = 17;break;
                    case 2017:idYear = 18;break;
                    case 2018:idYear = 19;break;
                    case 2019:idYear = 20;break;
                    case 2020:idYear = 21;break;
                    case 2021:idYear = 22;break;
                }

                zapis.println((i+1) + "," + nazwaDnia + "," + month + "," + kwartal + "," + idYear + "," + date);
            }
            zapis.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
