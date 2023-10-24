package it.unibo.encapsulation.interfaces;
public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder Andrea_Rossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder Alex_Bianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount AR = new SimpleBankAccount(Andrea_Rossi.getUserID(), 5000);
        SimpleBankAccount AB = new SimpleBankAccount(Alex_Bianchi.getUserID(), 12000);

        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");

        // 4) Effettuare una serie di depositi e prelievi
        AR.deposit(Andrea_Rossi.getUserID(), 2500);

        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");        

        AB.withdraw(Alex_Bianchi.getUserID(), 3200);

        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");

        AR.depositFromATM(Andrea_Rossi.getUserID(), 750);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");

        // 6) Provare a prelevare fornendo un id utente sbagliato
        AB.withdraw(4, 50);

        // 7) Controllare nuovamente l'ammontare
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");
    }
}
