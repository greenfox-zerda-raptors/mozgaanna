/**
 * Created by mozgaanna on 05/11/16.
 */
public class Workshop08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output
        int[][] first = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j) {
                    first[i][j] = 1;
                } else {
                    first[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < 4; i++){

            for (int j = 0; j < 4; j++){
                System.out.print( first[i][j] + " ");


            }

            System.out.println();

        }

    }
}
