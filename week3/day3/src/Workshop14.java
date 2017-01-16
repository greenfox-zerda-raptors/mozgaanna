/**
 * Created by mozgaanna on 06/11/16.
 */
public class Workshop14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]{3, 4, 5, 6, 7};

        int tmp = ah[0];
        ah[0] = ah[4];
        ah[4] = tmp;

        int tmp1 = ah[1];
        ah[1] = ah[3];
        ah[3] = tmp1;


//        for(int i = 0; i < ah.length / 2; i++){
//            int tmp2 = ah[i];
//            ah[i] = ah[ah.length-1-i];
//            ah[ah.length-1-i] = tmp2;
//        }


        for (int i = 0; i < ah.length; i++) {
            System.out.print(ah[i]);
            if (i < ah.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

