package Table;

import java.util.Random;

public class Generator {
    public Random random = new Random();

    public String Plec[] = {"Kobieta","Mężczyzna"};

    public String m_imiona[] = {"Adam","Adrian","Adolf","Albert","Aleksander","Alex","Allan","Amadeusz","Amir","Artur","Bartosz"
            ,"Bartłomiej","Bogdan","Bogumił","Borys","Bronisław","Cezary","Czesław","Cyryl","Damian","Daniel","Dawid","Dominik","Dorian"
            ,"Edward","Ernest","Eugeniusz","Eustachy","Fabian","Filip","Franciszek","Fryderyk","Gabriel","Grzegorz","Gustaw"
            ,"Henryk","Hubert","Ignacy","Igor","Jacek","Jan","Jakub","Janusz","Jarosław","Jeremiasz","Julian","Juliusz","Kacper"
            ,"Kajetan","Kamil","Karol","Kazimierz","Konrad","Kordian","Krzysztof","Kuba","Lech","Leszek","Ludwik","Łukasz","Maciej"
            ,"Maksymilian","Mikołaj","Mariusz","Marian","Miłosław","Miłosz","Natan","Norbert","Nikodem","Oktawian","Oskar","Patryk"
            ,"Paweł","Piotr","Przemysław","Ryszard","Robert","Romuald","Sebastian","Sergiusz","Sławomir","Stanisław","Szymon","Tadeusz"
            ,"Tomasz","Tymoteusz","Tytus","Wacław","Waldemar","Wiktor","Witold","Wojciech","Zbigniew","Zdzisław","Zenon","Zawisza"};

    public String d_imiona[] = {"Ada","Adela","Agata","Agnieszka","Aleksandra","Alicja","Amelia","Aneta","Angela","Anna","Apolina","Armanda"
            ,"Barbara","Beata","Blanka","Bolesława","Celina","Dianna","Dagmara","Dorota","Dominika","Dolores","Edyta","Eliza","Elżbieta"
            ,"Eryka","Emilia","Ewa","Ewelina","Franciszka","Gabriela","Gosia","Greta","Grażyna","Halina","Hanna","Helga","Honorata","Iga","Irena"
            ,"Izabela","Jadwiga","Jagoda","Janina","Jolanta","Justyna","Julia","Kaja","Kamila","Karolina","Klaudia","Krystyna","Lena"
            ,"Lilia","Lilianna","Magda","Marta","Maria","Małgosia","Mariola","Monika","Natasza","Nikola","Patrycja","Paulina","Oliwia"
            ,"Renata","Roksana","Samanta","Teresa","Tatiana","Weronika","Walentyna","Wioletta"};

    public String m_nazwiska[] = {"Adamecki","Araszkiewicz","Alexandrowicz","Bagiński","Betliński","Białecki","Bieliński","Biernacki","Bielecki"
            ,"Błaszczykowski","Boruc","Brzozowski","Budzuński","Bura","Chlebek","Chmiel","Chudzińki","Chudzińkski","Cichy","Ciechanowski"
            ,"Czachor","Czech","Czekalski","Czajkowski","Dąbrowski","Domagalski","Dunajewski","Filipczak","Kot","Jankowski","Maciejewski","Koziej"
            ,"Krakowiak","Pawlak"};

    public String d_nazwiska[] = {"Adamecka","Araszkiewicz","Alexandrowicz","Bagińska","Betlińska","Białecka","Bielińska","Biernacka","Bielecka"
            ,"Błaszczykowska","Boruc","Brzozowska","Budzuńska","Bura","Chlebek","Chmiel","Chudzińka","Chudzińkska","Cicha","Ciechanowska"
            ,"Czachor","Czech","Czekalska","Czajkowska","Dąbrowska","Domagalska","Dunajewska","Filipczak","Kot","Jankowska","Maciejewska","Koziej"
            ,"Krakowiak","Pawlak"};

    public String Kolory[] = {"Biały","Szary","Czarny","Srebrny","Niebieski","Czerwony","Zielony","Żółty"};

    public String Paliwa[] = {"LPG","Disel","Benzyna"};

    public String CarTypes[] = {"SUV","coupé","fastback","hatchback","kabriolet","kombi","liftback","dual cowl"};

    public String Napedy[] = {"Napęd tylny","Napęd przedni","Napęd 4x4"};

    public int iloscMiejsc[] = {4,5,7};

    public String Marki[] = {"Mercedes","Skoda","Citroen","Mitsubishi"};

    public String Mercedesy[] = {"Klasa A","Klasa E","Klasa S","Klasa G","AMG GT"};

    public String Skody[] = {"Octavia","Fabia","Karoq","Superb","Kodiaq","Rapid","Citigo","Scala","Kamiq"};

    public String Citroeny[] = {"C1","C3","C4","C4 Cactus"};

    public String Mitsubishi[] = {"ASX","L200","Outlander","Eclipse","Galant","Lancer"};

    public String nazwyDni[] = {"Poniedziałek","Wtorek","Środa","Czwartek","Piątek","Sobota","Niedziela"};

    public String nazwyMiesiacy[] = {"Styczeń","Luty","Marzec","Kwiecień","Maj","Czerwiec","Lipiec","Sierpień","Wrzesień","Październik","Listopad","Grudzień"};

    public String Kwartaly[] = {"Pierwszy kwartał","Drugi kwartał","Trzeci kwartał","Czwarty kwartał"};

    public int rok[] = {2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021};

    public String wojewodztwa[] = {" woj. zachodnio-pomorskie","woj. pomorskie","woj. warmińsko-mazurskie","woj. lubuskie","woj. wielkopolskie","woj. kujawsko-pomorskie","woj. mazowieckie","woj. podlaskie","woj. dolnośląskie","woj. łódzkie","woj. lubelskie","woj. opolskie","woj. śląskie","woj. małopolskie","woj. świętokrzyskie","woj. podkarpackie","woj. lubelskie"};

    public String nazwyMiast[] = {"Stara Wieś","Podlesie","Piaski","Nowa Wieś","Kolonia","Góra","Dół","Dąbrowa","Górki","Folwark",
    "Zalesie","Kąty","Góry","Górka","Zagórze","Zagrody","Pod Lasem","Budy","Błonie","Dwór","Dąbrówka","Podlas","Borek","Nowiny",
    "Wygoda","Łazy","Podgórze","Dział","Borki","Dębina","Cegielnia","Zarzecze","Granice","Kresy","Kamionka","Bugaj","Kamieniec",
    "Józefów","Przymiarki","Brzeziny"};

    public String nazwyUlic[] = {"1 Maja","3 Maja","11 Listopada","Akademicka","gen. Władysława Andersa","Armii Krajowej","Balonowa","Bankowa","Bernadyńska",
    "Beskidzka","Bielska","Bożego Ciała","Bracka","Kamienna","Kanomia","Kasprowicza","Katowicka","Klasztorna","Kolejowa","Kilińskiego","Krakowska","Krucza",
            "Puławska","Rajska","Racłwicka","Reja","Reymonta","Rycerska","Sandomierska","Sienkiewicza","Sienna","Skargi","Słowackiego","Chłodna","Ciasna",
    "Długa","Chopina","Chmielna","Chorzowska","Częstochowska","Dworcowa","Dąbrowskiego","Śląska","Fabryczna","Mariacka","Mickiewicza","Młyńska"};

}
