package org.exemple.demo;

public class Operation {
    private String date;
    private float  montant;
    private TypeOperation typeOperation;
    private float balance;


    public Operation(String date, float montant, TypeOperation typeOperation) {
        this.date = date;
        this.montant = montant;
        this.typeOperation = typeOperation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public float getMontant() {
        return montant;
    }

    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return date + " : " + typeOperation+ " de "+ montant + " --- Nouveau Solde = " + balance ;
    }
}
