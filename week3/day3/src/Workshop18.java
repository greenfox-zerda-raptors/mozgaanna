/**
 * Created by mozgaanna on 06/11/16.
 */
public class Workshop18 {
    public static int sumNumber(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        // write a function that sum all the numbers from 1 until the given parameter (a number)

        System.out.println(sumNumber(4));
    }
}
