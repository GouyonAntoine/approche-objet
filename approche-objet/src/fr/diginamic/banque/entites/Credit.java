package fr.diginamic.banque.entites;

public class Credit extends Operation{

    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Crédit";
    }
    
}
