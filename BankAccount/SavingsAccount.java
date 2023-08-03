package java_Assignment;

import java.util.Date;

class SavingsAccount extends Account {
    private double minimumDepositAmount;
    private int noOfTransactionsPerDay;
    public SavingsAccount() {
    }

    public SavingsAccount(int accountNo, Date openedDate, double balance, double minimumDepositAmount, int noOfTransactionsPerDay) {
        super(accountNo, openedDate, balance);
        this.minimumDepositAmount = minimumDepositAmount;
        this.noOfTransactionsPerDay = noOfTransactionsPerDay;
    }

    public double getMinimumDepositAmount() {
        return minimumDepositAmount;
    }

    public void setMinimumDepositAmount(double minimumDepositAmount) {
        this.minimumDepositAmount = minimumDepositAmount;
    }

    public int getNoOfTransactionsPerDay() {
        return noOfTransactionsPerDay;
    }


    public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {
        this.noOfTransactionsPerDay = noOfTransactionsPerDay;
    }
    public boolean validateSavingsAccountAttributes() {
        return minimumDepositAmount >= 0 && noOfTransactionsPerDay >= 0;
    }

}
