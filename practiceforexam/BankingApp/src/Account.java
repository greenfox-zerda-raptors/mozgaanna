/**
 * Created by mozgaanna on 11/12/16.
 */
public class Account {
    protected int accountNumber;
    protected double balance = 0.0;
    protected User user;


    public Account(int accountNumber, double balance, User user) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
    }


    public void deposit(double depositAmount){
       if (depositAmount > 0) {
           balance += depositAmount;
       }

    }

    public void withdraw(double withdrawAmount){
       if (balance >= withdrawAmount && withdrawAmount > 0){
           balance -= withdrawAmount;
       }
    }

    public void transfer(double transferAmount, Account destinationAccount) throws Exception {
        if (transferAmount <= balance){
            destinationAccount.deposit(transferAmount);
            this.withdraw(transferAmount);
        } else{
            throw new Exception("Not enough funds.");
        }
    }

    public void audit(){

    }


    @Override
    public String toString() {
        return "\n Account: \n" +
                "accountNumber = " + accountNumber + "\n" +
                "balance = " + balance + "\n" +
                "user: " + user;
    }
}
