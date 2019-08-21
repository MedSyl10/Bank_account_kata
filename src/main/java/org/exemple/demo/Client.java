package org.exemple.demo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int numeroClient;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private List<Account> accounts = null;


    public Client(int numeroClient, String nom, String prenom) {
        this.numeroClient = numeroClient;
        this.nom = nom;
        this.prenom = prenom;
        this.accounts = new ArrayList <Account>();
    }

    public Client(int numeroClient, String nom, String prenom, String dateDeNaissance) {
        this.numeroClient = numeroClient;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account N° : " + account.getNumeroCompte() +" attributed to client N° : " + getNumeroClient());
    }

    public void checkAccountOperation(String numeroCompte){
        Account toCheck = getAccount(numeroCompte);
        if(toCheck != null) {
            System.out.println("\n------------ HISTORIQUE DES TRANSACTIONS -------------");
            for (Operation operation : toCheck.getJournal()) {
                System.out.println(operation);
            }
        }else{
            System.out.println("Numéro de compte inexistant ! ");
        }
    }

    public Account getAccount(String numeroCompte) {
        for(Account account: accounts){
            if(account.getNumeroCompte().equals(numeroCompte))
                return account;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeroClient=" + numeroClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }
}
