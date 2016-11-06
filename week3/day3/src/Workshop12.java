/**
 * Created by mozgaanna on 06/11/16.
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first and the third element of the array
        // Expected output: third second first
        String[] abc = new String[] { "first", "second", "third" };

        String tmp = abc[0];
        abc[0] = abc[2];
        abc[2] = tmp;


        for(int i = 0; i < abc.length; i++){
            System.out.print(abc[i] + " ");
        }
    }
}
