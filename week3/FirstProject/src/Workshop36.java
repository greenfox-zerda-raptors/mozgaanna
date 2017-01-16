/**
 * Created by mozgaanna on 03/11/16.
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        String x = "#";

        for (int k = 1; k <= 5; k++) {
            for(int m = 1; m <= 5; m++){
              System.out.print(x);
              if(m < 5)
                System.out.print(" ");

            }
          System.out.println();
        }
    }
}
