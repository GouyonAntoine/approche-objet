package fr.diginamic.banque;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\n");
    
        Compte monCompte = new Compte(1, 99999);
        System.out.println(monCompte);
        System.out.println("Mon numero de compte et mon solde sont => " + monCompte.toString());

        Compte monCompteTaux = new CompteTaux(1, 99999, 10);
        System.out.println(monCompteTaux);
        System.out.println("Mon numero de compte, mon solde et son taux sont => " + monCompteTaux.toString() + "\n");

        List<Compte> listCompte = new ArrayList<>();
        listCompte.add(monCompte);
        listCompte.add(monCompteTaux);

        System.out.println("Test Afficher des comptes de ma liste avec un compte classique et un avec taux : ");
        for (int i=0; i<listCompte.size(); i++) {
            System.out.println("Mon numero de compte et mon solde (et son taux si il en a un) sont => " + listCompte.get(i).toString());
        }

    }
}
