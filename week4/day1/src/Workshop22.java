/**
 * Created by mozgaanna on 07/11/16.
 */
public class Workshop22 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth

        int lastIndex = sb.lastIndexOf("third");

        sb.replace(lastIndex, 5, "fourth");


        System.out.println(sb);
    }
}
