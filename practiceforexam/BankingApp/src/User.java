/**
 * Created by mozgaanna on 11/12/16.
 */
public class User {
    private String firstName;
    private String lastName;
    private String address;


    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    @Override
    public String toString() {
        return
                "name = " + firstName + lastName +
                " address = " + address;
    }
}
