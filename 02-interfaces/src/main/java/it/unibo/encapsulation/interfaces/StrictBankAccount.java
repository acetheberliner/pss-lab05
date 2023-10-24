package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private double balance;
    private int transactions;
    private double management;
    static double ATM_TRANSACTION_FEE = 1;
    static double MANAGEMENT_FEE = 5;
    static double MANAGEMENT_MULTIPLIER = 0.1;
    private final int id;


    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance=balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(final int id, final double amount) {
        if(this.id==id){
            this.transactions+=1;
            this.balance+=amount;
            System.out.println("Deposito sul conto [" + id + "] di [" + amount + "] Euro");
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void withdraw(final int id, final double amount) {
        if(this.id==id){
            if(amount<=this.balance){
                this.transactions+=1;
                this.balance-=amount;
            }else{
                System.out.println("ERRORE MASSIMO IMPORTO PRELEVABILE: " + getBalance());
            }
            System.out.println("Prelievo dal conto [" + id + "] di [" + amount + "] Euro");
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if(this.id==id){
            this.transactions+=1;
            this.balance+=(amount-ATM_TRANSACTION_FEE);
            System.out.println("Deposito ATM sul conto [" + id + "] di [" + amount + "] Euro (tassa: " + ATM_TRANSACTION_FEE +")");
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        if(this.id==id){
            if(amount<=this.balance){
                this.transactions+=1;
                this.balance-=(amount+ATM_TRANSACTION_FEE);
            }else{
                System.out.println("ERRORE MASSIMO IMPORTO PRELEVABILE: " + (getBalance()-ATM_TRANSACTION_FEE));
            }
            System.out.println("Prelievo dal conto [" + id + "] di [" + amount + "] Euro");
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void chargeManagementFees(final int id) {
        if(this.id==id){
            this.management+=MANAGEMENT_FEE+(MANAGEMENT_MULTIPLIER * getTransactionsCount());
            System.out.println("Spese di gestione dell'utente [" + id + "]: " + management + " Euro");
        }
        else{
            System.out.println("Utente non riconosciuto");
        }
    }

}
