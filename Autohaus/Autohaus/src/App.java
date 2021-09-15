public class App {

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.startMenu();
    
   /*     //Verkauf 1
        Autos a1 = new Autos("VW", "Golf", 2015);
        Kunde k1 = new Kunde("Bernd", "Müller");
        k1.setAdresse("Turmweg 1");
        k1.setTelefon("0173237889");
        Verkaeufer v1 = new Verkaeufer("Franz", "Schmidt", 4398);

        //Verkauf 2
        Autos a2 = new Autos("Mustang", "GT", 2020);
        Kunde k2 = new Kunde("Heiner", "Müller");
        k2.setAdresse("Bochumer Allee 24");
        k2.setTelefon("01635152784");
        v1.setVorname("Franz");
        v1.setNachname("Schmidt");
        v1.setPersonalnummer(4398);

        //Verkauf 3
        Autos a3 = new Autos("Dodge", "Charger", 1987);
        Kunde k3 = new Kunde("Kurt", "Leutner");
        k3.setAdresse("Keuchelstraße 12");
        k3.setTelefon("01712739499");
        Verkaeufer v2 = new Verkaeufer("Dieter", "Süler", 4399);
  
        //Verkauf 4
        Autos a4 = new Autos("Ford", "Focus", 2013);
        Kunde k4 = new Kunde("Lennard", "Spacko");
        k4.setAdresse("Deppenstraße 187");
        k4.setTelefon("019331877");
        v2.setVorname("Dieter");
        v2.setNachname("Süler");
        v2.setPersonalnummer(4399);
        

     //a1 verweist auf Auto und der costructor verweist auch aufs auto, das gleiche ist bei v1 und verkäufer und bei k1 und kunde, dazu wurde ein constructor in auto, verkäufer und kunde erstellt. in diesen funktionen wurden dann auch die einzelnen methoden der klasse eingefügt, d.h. bei kunde wären das zum beispiel vorname, nachname, telefonnummer und adresse. dies gibt dann vor, dass beim abruf die aus dem constructor vorgegebenen eigenschaften befüllt werden müssen. also wenn man vorname, nachname, preis hat, dann musss es string, string, int sein. diese teile müssen dann halt einen wert haben 



        //es wird die das Verkaufsprotokoll erstellt mit den eigenschaften
        Verkauf vk1 = new Verkauf(a1, v1, k1);
        vk1.setPreis(4299);

        //es wird die das Verkaufsprotokoll erstellt mit den eigenschaften
        Verkauf vk2 = new Verkauf(a2, v1, k2);
        vk2.setPreis(3500);

        //es wird die das Verkaufsprotokoll erstellt mit den eigenschaften
        Verkauf vk3 = new Verkauf(a3, v2, k3);
        vk3.setPreis(3600);
        
        //es wird die das Verkaufsprotokoll erstellt mit den eigenschaften
        Verkauf vk4 = new Verkauf(a4, v2, k4);
        vk4.setPreis(3700);

        

        // a1.setMarke("Toyota");
        //es wird die marke überschrieben und da das als letztes vor System out stand wird das ausgegeben
        //auch ginge, da man auf vk1 getauto zugreift
        // vk1.getAuto().setMarke("Toyota");

        //System.out.println(vk1.getAuto().getMarke() + " " + vk1.getAuto().getModell() + " " + vk1.getAuto().getBaujahr() + " " + vk1.getKunde().getVorname() + " " + vk1.getKunde().getNachname() + " " + vk1.getKunde().getAdresse() + " " + vk1.getKunde().getTelefon() + " " + vk1.getPreis() + " " + vk1.getVerkaeufer().getVorname() + " " + vk1.getVerkaeufer().getNachname() + " " + vk1.getVerkaeufer().getPersonalnummer());
        //System.out.println(vk2.getAuto().getMarke() + " " + vk2.getAuto().getModell() + " " + vk2.getAuto().getBaujahr() + " " + vk2.getKunde().getVorname() + " " + vk2.getKunde().getNachname() + " " + vk2.getKunde().getAdresse() + " " + vk2.getKunde().getTelefon() + " " + vk2.getPreis() + " " + vk2.getVerkaeufer().getVorname() + " " + vk2.getVerkaeufer().getNachname() + " " + vk2.getVerkaeufer().getPersonalnummer());
        //System.out.println(vk3.getAuto().getMarke() + " " + vk3.getAuto().getModell() + " " + vk3.getAuto().getBaujahr() + " " + vk3.getKunde().getVorname() + " " + vk3.getKunde().getNachname() + " " + vk3.getKunde().getAdresse() + " " + vk3.getKunde().getTelefon() + " " + vk3.getPreis() + " " + vk3.getVerkaeufer().getVorname() + " " + vk3.getVerkaeufer().getNachname() + " " + vk3.getVerkaeufer().getPersonalnummer());
        //System.out.println(vk4.getAuto().getMarke() + " " + vk4.getAuto().getModell() + " " + vk4.getAuto().getBaujahr() + " " + vk4.getKunde().getVorname() + " " + vk4.getKunde().getNachname() + " " + vk4.getKunde().getAdresse() + " " + vk4.getKunde().getTelefon() + " " + vk4.getPreis() + " " + vk4.getVerkaeufer().getVorname() + " " + vk4.getVerkaeufer().getNachname() + " " + vk4.getVerkaeufer().getPersonalnummer());     **/
    }
}
