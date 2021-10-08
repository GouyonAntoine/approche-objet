package entites;

public class AdressePostale {

    //MyAttributes
    private int numRue;
    private int codePostal;
    private String nomRue;
    private String ville;
    
    //MyConstructor
    public AdressePostale(int numRue, int codePostal, String nomRue, String ville){
        this.numRue = numRue;
        this.codePostal = codePostal;
        this.nomRue = nomRue;
        this.ville = ville;
    }

    //MyGetterSetter
    public int getNumRue() {
        return this.numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public int getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomRue() {
        return this.nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    //MyMethode

    public String toString(){
        String affichage = (numRue + " " + nomRue + " " + ville + " " + codePostal);
        return affichage;
    }
}
