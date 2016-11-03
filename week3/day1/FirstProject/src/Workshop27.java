/**
 * Created by mozgaanna on 03/11/16.
 */
public class Workshop27 {
    public static void main(String[] args) {
        String y = "seasons";
        int out = 6;
        // if the last and the first letter of the string
        // are the same double the variable
        // called out, if not half it

        if (y.charAt(0) == y.charAt(y.length() - 1)) {
            System.out.println(out * 2);
        } else {
            System.out.println(out % 2);
        }
    }
}
