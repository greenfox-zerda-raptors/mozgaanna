import java.util.ArrayList;

/**
 * Created by mozgaanna on 11/12/16.
 */
public class Bank {
    private String name;

    private ArrayList<Account> accounts = new ArrayList<>();


    public Bank(String name) {
        this.name = name;
    }

    public void add(Account newAccount){
        accounts.add(newAccount);
    }

    public Account getAccount(int accountNumber) throws Exception {
        for (Account account: accounts) {
            if (account.accountNumber == accountNumber){
                return account;
            }
        }

        throw new Exception("Account number not found");
    }

    public void accountTransfer(double transferAmount, int destAccNumber, int srcAccNumber) throws Exception {
        getAccount(srcAccNumber).transfer(transferAmount, getAccount(destAccNumber));
    }

    @Override
    public String toString() {
        return "Bank \n" +
                "name ='" + name + '\'' + "\n" +
                "Accounts = " + accounts + "\n";
    }
}
