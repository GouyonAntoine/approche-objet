package fr.diginamic.banque.entites;


public class Debit extends Operation{

    public Debit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Débit";
    }
}
