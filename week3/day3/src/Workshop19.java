/**
 * Created by mozgaanna on 06/11/16.
 */
public class Workshop19 {


    public static int factorial (int n) {
       int product = 1;
       for (int k = 1; k <= n; k++) {
           product = product * k;

       }
       return product;
    }

    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(factorial(8));
    }
}
