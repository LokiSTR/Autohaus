public class Schueler {
    
    //Deklaration der klassenvariablen 
    String _vorname;
    String _nachname;
    String _adresse;
    String _groesse;
    String _alter;

    
    //Constructor
        public Schueler(String vorname, String nachname, String adresse, String groesse, String alter) {
        //Variablen wird initialisiert
        setVorname(vorname);
        setNachname(nachname);
        setAdresse(adresse);
        setGroesse(groesse);
        setAlter(alter);
        

    }

    //getter für vorname
    public String getVorname(){
        return _vorname;
    }
    public String getNachname(){
        return _nachname;
    }
    public String getAdresse(){
        return _adresse;
    }
    public String getGroesse(){
        return _groesse;
    }
    public String getAlter(){
        return _alter;
    }
    // in der klammer steht ein datentyp und dann eine variable
    public void setVorname(String vorname){
        _vorname = vorname;
    }
    public void setNachname(String nachname){
        _nachname = nachname;
    }
    public void setAdresse(String adresse){
        _adresse = adresse;
    }
    public void setGroesse(String groesse){
        _groesse = groesse;
    }
    public void setAlter(String alter){
        _alter = alter;
    }
}