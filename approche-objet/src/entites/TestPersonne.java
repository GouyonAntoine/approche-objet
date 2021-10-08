package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\n");
        
        AdressePostale monAdresse = new AdressePostale(22,34090,"rue des hospices","Montpellier");
        AdressePostale monAdresseSecondaire = new AdressePostale(1,9999,"rue de la gloire","Valhalla");

        System.out.println("Mon adresse est : " + monAdresse.toString() +"\n");
        System.out.println("Mon adresse est : " + monAdresseSecondaire.toString() +"\n");

        Personne antoine = new Personne("Gouyon", "Antoine", monAdresse);
        Personne odin = new Personne("Pere", "Odin");
        odin.setMyAdress(monAdresseSecondaire);

        System.out.println("Salutation mon ami ! \n" + antoine.toString() + "\n");
        System.out.println("Salutation mon ami ! \n" + odin.toString() + "\n");
    }
}
