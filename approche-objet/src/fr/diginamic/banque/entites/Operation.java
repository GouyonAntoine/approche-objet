package fr.diginamic.banque.entites;

public abstract class Operation {

    //MyAttribute
    private String dateOperation;
    private double montantOperation;


    //Constructor
    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    //MyGetterSetter
    public String getDateOperation() {
        return this.dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {
        return this.montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }


    @Override
    public String toString() {
        return "{"+
            " dateOperation='" + getDateOperation() + "'" +
            ", montantOperation='" + getMontantOperation() + "'" +
            "}";
    }

    //MyMethode
    public abstract String getType();
}
