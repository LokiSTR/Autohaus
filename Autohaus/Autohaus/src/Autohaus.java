public class Autohaus {
    
    String _name;
    String _adresse;
    String _telefon;


    public Autohaus(String name, String adresse, String telefon){

        setName(name);
        setAdresse(adresse);
        setTelefon(telefon);
    }

    public String getName(){
        return _name;
    }
    public String getAdresse(){
        return _adresse;
    }
    public String getTelefon(){
        return _telefon;
    }

    public void setName(String name){
        _name = name;
    }
    public void setAdresse(String adresse){
        _adresse = adresse;
    }
    public void setTelefon(String telefon){
        _telefon = telefon;
    }

}
