package fr.diginamic.banque.entites;

public class Compte {
    
    //MyAttribute 
    private int numCompte;
    private int soldeCompte;


    //MyConstructor
    public Compte(){

    }

    public Compte(int numCompte){
        this.numCompte = numCompte;
    }
    
    public Compte(int numCompte, int soldeCompte){
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    //MyGetterSetter
    public int getNumCompte() {
        return this.numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldeCompte() {
        return this.soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }


    //MyMethode
    public String toString(){
        String affichage = (numCompte + " " + soldeCompte);
        return affichage;
    }
}
