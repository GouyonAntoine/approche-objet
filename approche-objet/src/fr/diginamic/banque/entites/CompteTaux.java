package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    //MyAttribue
    private double tauxRemuneration;

    //MyConstructor
    public CompteTaux(){

    }

    public CompteTaux(int numCompte, int soldeCompte, double tauxRemuneration){
        super(numCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    //MyGetterSetter
    public double getTauxRemuneration() {
        return this.tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    //MyMethode
    public String toString(){
        String affichage = super.toString() + " | " + this.tauxRemuneration;
        return affichage;
    }

    
}
