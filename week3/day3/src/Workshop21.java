/**
 * Created by mozgaanna on 06/11/16.
 */

// 5! = 5 * 4 * 3 * 2 * 1
// 5! = 5 * 4!
    //4! = 4 * 3!
        //3! = 3 * 2!
             //2! = 2 * 1

public class Workshop21 {
    public static int fact_r(int n){
        System.out.println("FACT_R IN: " + n);
        if(n > 1) {
            int val = n * fact_r(n - 1);
            System.out.println("FACT_R OUT: " + val);
            return val;
        }
        else {
            System.out.println("FACT_R_1");
            return 1;
        }
    }

    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(fact_r(8));
    }
}
