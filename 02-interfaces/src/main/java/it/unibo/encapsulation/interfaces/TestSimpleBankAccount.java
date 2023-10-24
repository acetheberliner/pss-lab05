package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2


        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount Andrea_Rossi = new SimpleBankAccount(1, 5000);
        SimpleBankAccount Alex_Bianchi = new SimpleBankAccount(2, 12000);

        System.out.println("Valore del conto di Andrea Rossi: " + Andrea_Rossi.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + Alex_Bianchi.getBalance() + " Euro\n");

        // 4) Effettuare una serie di depositi e prelievi
        Andrea_Rossi.deposit(1, 2500);

        System.out.println("Valore del conto di Andrea Rossi: " + Andrea_Rossi.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + Alex_Bianchi.getBalance() + " Euro\n");        

        Alex_Bianchi.withdraw(2, 3200);

        System.out.println("Valore del conto di Andrea Rossi: " + Andrea_Rossi.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + Alex_Bianchi.getBalance() + " Euro\n");

        Andrea_Rossi.depositFromATM(1, 750);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("Valore del conto di Andrea Rossi: " + Andrea_Rossi.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + Alex_Bianchi.getBalance() + " Euro\n");

        // 6) Provare a prelevare fornendo un id utente sbagliato
        Alex_Bianchi.withdraw(4, 50);

        // 7) Controllare nuovamente l'ammontare
        System.out.println("Valore del conto di Alex Bianchi: " + Alex_Bianchi.getBalance() + " Euro\n");
    }
}
