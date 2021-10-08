package fr.diginamic.banque;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\n");
    
        List<Operation> listOp = new ArrayList<>();
        Operation credit1 = new Credit("11/12/2021", 100);
        Operation credit2 = new Credit("12/12/2021", 200);
        Operation debit1 = new Debit("13/12/2021", 50);
        Operation debit2 = new Debit("14/12/2021", 600);

        listOp.add(credit1);
        listOp.add(credit2);
        listOp.add(debit1);
        listOp.add(debit2);

        for (int i=0; i<listOp.size(); i++) {
            System.out.println("Information sur l'Opération n°" + i + " qui est un " + listOp.get(i).getType() + " => " + listOp.get(i).toString());
        }
        
        double montantOperation = 0;
        
        for (int i=0; i<listOp.size(); i++) {
            System.out.println(listOp.get(i).getType() + "sur le compte de : " + listOp.get(i).getMontantOperation());
            if(listOp.get(i).getType() == "Crédit"){
                montantOperation += listOp.get(i).getMontantOperation();
            }
            else {
                montantOperation -= listOp.get(i).getMontantOperation();
            }
        }
        if(montantOperation >= 0){
            System.out.println("Votre solde est positif de : " + montantOperation);
        }
        else {
            System.out.println("Votre solde est à découvert de : " + montantOperation);
        }
    }
}
