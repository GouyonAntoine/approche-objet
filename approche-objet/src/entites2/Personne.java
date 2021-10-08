package entites2;

import entites.AdressePostale;

public class Personne {

    //Attribute
    public String nom;
    public String prenom;
    AdressePostale myAdress;

    //MyConstructor
    public Personne(String nom, String prenom, AdressePostale myAdress){
        this.nom = nom;
        this.prenom = prenom;
        this.myAdress = myAdress;
    }

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }



    //MyGetterSetter
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getMyAdress() {
        return this.myAdress;
    }

    public void setMyAdress(AdressePostale myAdress) {
        this.myAdress = myAdress;
    }
    

    //MyMethode
    public String toString(){
        String affichage = ("Je m'apelle " + nom + " " + prenom + " et j'habite au " + myAdress.toString());
        return affichage;
    }

}
