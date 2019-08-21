package org.exemple.demo;

public class Main
{
    public static void main( String[] args )
    {
        Client client = new Client(001,"Sylla","Mohamed");
        Client client2 = new Client(001,"Sylla","Benjamin");

        Account a1 = new Account("CPT01");
        Account a2 = new Account("CPT02");

        client.addAccount(a1);
        client.addAccount(a2);

        Operation o1 = new Operation("20180105",200000f,TypeOperation.Depot);
        Operation o2 = new Operation("20180214",100000f,TypeOperation.Retrait);

        Operation o3 = new Operation("20180105",15000f,TypeOperation.Depot);
        Operation o4 = new Operation("20180214",20000f,TypeOperation.Retrait);

        client.getAccount(a1.getNumeroCompte()).executeOperation(o1);
        client.getAccount(a1.getNumeroCompte()).executeOperation(o2);

        client.getAccount(a2.getNumeroCompte()).executeOperation(o3);
        client.getAccount(a2.getNumeroCompte()).executeOperation(o4);

        client.checkAccountOperation(a1.getNumeroCompte());
        client.checkAccountOperation(a2.getNumeroCompte());

        client.getAccount(a2.getNumeroCompte()).executeOperation(o1);

        client.checkAccountOperation(a2.getNumeroCompte());

    }
}
