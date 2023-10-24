package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder Andrea_Rossi = new AccountHolder("Andrea", "Rossi", 1);

        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder Alex_Bianchi = new AccountHolder("Alex", "Bianchi", 2);

        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        SimpleBankAccount AR = new SimpleBankAccount(Andrea_Rossi.getUserID(), 5000);
        StrictBankAccount AB = new StrictBankAccount(Alex_Bianchi.getUserID(), 12000);

        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */

        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        AR.deposit(Andrea_Rossi.getUserID(), 10000);
        AB.deposit(Alex_Bianchi.getUserID(), 10000);

        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");
        
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        AR.withdraw(Andrea_Rossi.getUserID(), 15000);
        AB.withdraw(Alex_Bianchi.getUserID(), 15000);

        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");
        
        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        AR.deposit(Andrea_Rossi.getUserID(), 10000);
        AB.deposit(Alex_Bianchi.getUserID(), 10000);

        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");

        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        AR.computeManagementFees(Andrea_Rossi.getUserID());
        AB.computeManagementFees(Alex_Bianchi.getUserID());

        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println("Valore del conto di Andrea Rossi: " + AR.getBalance() + " Euro");
        System.out.println("Valore del conto di Alex Bianchi: " + AB.getBalance() + " Euro\n");
        
        /*
         * 12) Qual è il risultato e perché?
         */
    }
}
