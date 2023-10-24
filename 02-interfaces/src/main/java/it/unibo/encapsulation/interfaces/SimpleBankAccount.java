package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {

    private double balance;
    private int transactions;
    static double ATM_TRANSACTION_FEE = 1;
    private final int id;

    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance=balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
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
            this.transactions+=1;
            this.balance-=amount;
            if(amount>this.balance){
                System.out.println("Conto in rosso");
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
            this.transactions+=1;
            this.balance-=(amount+ATM_TRANSACTION_FEE);
            if(amount>this.balance){
                System.out.println("Conto in rosso");
            }
            System.out.println("Prelievo ATM dal conto [" + id + "] di [" + amount + "] Euro (tassa: " + ATM_TRANSACTION_FEE +")");
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void computeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
    }
}
