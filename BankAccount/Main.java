package java_Assignment;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis Bank ", "Hyderabadh");
        //int accountNo, Date openedDate, double balance, double minimumDepositAmount, int noOfTransactionsPerDay
        System.out.println("...................saving account .......................");
        SavingsAccount savingsAccount = new SavingsAccount(1000, new Date(), 5000.0, 1000.0, 5);
        SavingsAccount savingsAccount2 = new SavingsAccount(1010, new Date(), 6000.0, 1500.0, 9);
        SavingsAccount savingsAccount3 = new SavingsAccount(1015, new Date(), 9000.0, 2000.0, 7);
        System.out.println("...................................current Account......................");
        CurrentAccount currentAccount1 = new CurrentAccount(2001, new Date(), 5000.0, 2000.0);
        CurrentAccount currentAccount2 = new CurrentAccount(2002, new Date(), 10000.0, 5000.0);
        CurrentAccount currentAccount3 = new CurrentAccount(2003, new Date(), 20000.0, 10000.0);


        bank.addAccount(savingsAccount);
        bank.addAccount(savingsAccount2);
        bank.addAccount(savingsAccount3);
        bank.addAccount(currentAccount1);
        bank.addAccount(currentAccount2);
        bank.addAccount(currentAccount3);

        try {
            bank.transaction('w', 1000, 2000);
            bank.transaction('d', 1010, 3000);
            bank.transaction('w', 1015, 10000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Display updated account balances
        System.out.println("------------------------");
        System.out.println("Updated Account Balances:");
        bank.showAccounts();


        bank.showAccounts();
    }
    }
