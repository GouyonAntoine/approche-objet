package entites;

public class TestAdressePostale {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Hello, World!");
        
        AdressePostale monAdresse = new AdressePostale(22,34090,"rue des hospices","Montpellier");
        AdressePostale monAdresseSecondaire = new AdressePostale(1,9999,"rue de la gloire","Valhalla");

        System.out.println("Mon adresse est : " + monAdresse.toString() +"\n");
        System.out.println("Mon adresse est : " + monAdresseSecondaire.toString() +"\n");
    }
}
