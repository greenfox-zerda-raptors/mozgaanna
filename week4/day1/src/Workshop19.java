/**
 * Created by mozgaanna on 07/11/16.
 */
public class Workshop19 {
    public static void main(String... args) {
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        builder.replace(3, 4, "l");
        builder.append(" " + name + "!");

        System.out.println(builder);
    }
}