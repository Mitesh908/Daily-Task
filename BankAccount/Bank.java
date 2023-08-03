package java_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Bank {


        private String bankName;
        private String branchName;
        private List<Account> accounts;

        // Constructors
        public Bank(String bankName, String branchName) {
            this.bankName = bankName;
            this.branchName = branchName;
            this.accounts = new ArrayList<>();
        }

        public String getBankName() {
            return bankName;
        }
        public void setBankName(String bankName) {
            this.bankName = bankName;
        }
        public String getBranchName() {
            return branchName;
        }
        public void setBranchName(String branchName) {
            this.branchName = branchName;
        }


        public boolean addAccount(Account account) {
            if (accounts.size() >= 10) {
                throw new RuntimeException("Cannot add more than 10 accounts.");
            }
            if (!(account instanceof SavingsAccount) && !(account instanceof CurrentAccount)) {
                return false;
            }
            accounts.add(account);
            return true;
        }
        public void showAccounts() {
            for (Account account : accounts) {
                System.out.println("Account No: " + account.getAccountNo());
                System.out.println("Opened Date: " + account.getOpenedDate());
                System.out.println("Balance: " + account.getBalance());
                System.out.println("------------------------");
            }
        }

        public void transaction(char type, int accountNo, double amount) throws InsufficientBalanceException {
            Account account = null;

            for (Account acc : accounts) {
                if (acc.getAccountNo() == accountNo) {
                    account = acc;
                    break;
                }
            }
            if (account == null) {
                throw new IllegalArgumentException("Account not found ");
            }

            if (type == 'w') {
                if (account instanceof SavingsAccount) {
                    SavingsAccount savingsAccount = (SavingsAccount) account;
                    double minBalance = savingsAccount.getMinimumDepositAmount();
                    if (account.getBalance() - amount < minBalance) {
                        throw new InsufficientBalanceException("Insufficient balance.");
                    }
                }
                account.setBalance(account.getBalance() - amount);
            } else if (type == 'd') {
                account.setBalance(account.getBalance() + amount);
            } else {
                throw new IllegalArgumentException("Invalid transaction type. Use 'w' for withdraw and 'd' for deposit.");
            }
        }
    }
