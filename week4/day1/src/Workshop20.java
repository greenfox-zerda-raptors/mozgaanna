/**
 * Created by mozgaanna on 07/11/16.
 */
public class Workshop20 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("second line\n");
        // Add "first line" to the beginning of the sb
        // Add "third line" to the end of the sb
        // Expected output:
        // first line
        // second line
        // third line


        sb.insert(0, "first line\n");
        sb.append("third line");


        System.out.println(sb);


//        System.out.println(sb.toString());
    }
}
