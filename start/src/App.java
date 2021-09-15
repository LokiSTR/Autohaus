public class App {
    //header  
    public static void main(String[] args)throws Exception {
        //es werden fünf variablen von der klasse Schueler erstellt, dieses objekt heißt s1
        // erst der datentxp (schueler), dann der name (s1) und dann eine zuweisung zu new schueler()
        
        Schueler s1 = new Schueler("Holger", "Trampe", "Turmweg", "1,83", "24");
        Schueler s2 = new Schueler("Holger 2", "Trampe 2", "Turmweg 2", "1,87", "21");
        Schueler s3 = new Schueler("Holger 3", "Trampe 3", "Turmweg 3", "1,67", "44");
        Schueler s4 = new Schueler("Holger 4", "Trampe 4", "Turmweg 4", "1,65", "35");
        Schueler s5 = new Schueler("Holger 5", "Trampe 5", "Turmweg 5", "1,98", "65");

        System.out.println(s1.getVorname() + " " + s1.getNachname() + " " + s1.getAdresse() + " " + s1.getGroesse() + " " + s1.getAlter());
        System.out.println(s2.getVorname() + " " + s2.getNachname() + " " + s2.getAdresse() + " " + s2.getGroesse() + " " + s2.getAlter());
        System.out.println(s3.getVorname() + " " + s3.getNachname() + " " + s3.getAdresse() + " " + s3.getGroesse() + " " + s3.getAlter());
        System.out.println(s4.getVorname() + " " + s4.getNachname() + " " + s4.getAdresse() + " " + s4.getGroesse() + " " + s4.getAlter());
        System.out.println(s5.getVorname() + " " + s5.getNachname() + " " + s5.getAdresse() + " " + s5.getGroesse() + " " + s5.getAlter());

        Klassenraum k1 = new Klassenraum("EAInf");
        
        System.out.println(k1.getName());
    
    }    
}