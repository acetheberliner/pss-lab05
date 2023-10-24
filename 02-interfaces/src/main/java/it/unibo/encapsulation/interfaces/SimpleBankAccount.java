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
                System.out.println("Valore massimo di prelievo: "+getBalance());
            }
        }else{
            System.out.println("Utente non riconosciuto");
        }
    }

    public void depositFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
    }

    public void withdrawFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
    }

    public void chargeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
    }
}
