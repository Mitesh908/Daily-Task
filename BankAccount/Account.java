package java_Assignment;

import java.util.Date;

public class Account {
private int accountNo ;
private Date openedDate ;
private double balance ;

public Account(){

}

public Account(int accountNo, Date openedDate, double balance){
    this.accountNo=accountNo ;
    this.openedDate = openedDate;
    this.balance = balance ;

}

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public double getBalance() {
        return balance;
    }

    public void  setBalance(double balance) {
        this.balance = balance;
    }
}
