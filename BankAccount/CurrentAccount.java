package java_Assignment;
import java.util.Date;
class CurrentAccount extends Account {
    private double overDraftLimit;
    public CurrentAccount() {
    }

    public CurrentAccount(int accountNo, Date openedDate, double balance, double overDraftLimit) {
        super(accountNo, openedDate, balance);
        this.overDraftLimit = overDraftLimit;
    }
    public double getOverDraftLimit() {
        return overDraftLimit;
    }
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public boolean validateCurrentAccountAttributes() {

        return overDraftLimit >= 0;
    }
}
