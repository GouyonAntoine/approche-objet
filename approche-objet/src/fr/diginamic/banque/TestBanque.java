package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\n");
        
        Compte monCompte = new Compte(1, 99999);
        System.out.println(monCompte);
        System.out.println("Mon numero de compte et mon solde sont => " + monCompte.toString());
    }
}
