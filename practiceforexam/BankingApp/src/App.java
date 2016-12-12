/**
 * Created by mozgaanna on 11/12/16.
 */
public class App {
    public static void main(String[] args) {
        Bank bank = new Bank("JewBank");
        User anna = new User("Anna ", "Mozga", "Budapest");
        User sugarDaddyFabi = new User("Fabian ", "Csorba", "Budapest");
        bank.add(new Savings(1234, 100.00, anna));
        bank.add(new Checking(5678, 220.00, sugarDaddyFabi));

        System.out.println(bank);
        System.out.println();

        try {
            bank.getAccount(1234).deposit(40.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(bank.getAccount(1234));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            bank.accountTransfer(80.00, 1234, 5678);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            bank.getAccount(1234).withdraw(24.89);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(bank);

    }

}