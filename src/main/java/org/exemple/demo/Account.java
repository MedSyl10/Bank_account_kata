package org.exemple.demo;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String numeroCompte;
    private float solde;
    private List<Operation> journal = null;

    public Account(String numeroCompte) {
        this.numeroCompte = numeroCompte;
        this.journal = new ArrayList <Operation>();
        this.solde = 0.0f;
        System.out.println("Account n°: " + numeroCompte + " créé !") ;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void executeOperation(Operation operation){
        System.out.println("\n********** TRANSACTION DU " + operation.getDate() + " **********" );
        System.out.println("\tAncien solde est de : " + solde);
        if(operation.getTypeOperation().equals(TypeOperation.Depot)){
            solde+=operation.getMontant();
            System.out.println("\t\tDépot de : " + operation.getMontant());
        }else{
            solde-=operation.getMontant();
            System.out.println("\t\tRetrait de : " + operation.getMontant());
        }

        operation.setBalance(solde);
        journal.add(operation);
        System.out.println("\tNouveau solde est de : " + solde);
    }

    public List <Operation> getJournal() {
        return journal;
    }
}
