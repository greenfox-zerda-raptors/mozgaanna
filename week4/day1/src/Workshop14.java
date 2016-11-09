import java.util.*;

/**
 * Created by mozgaanna on 08/11/16.
 */
public class Workshop14 {
    public static void main(String... args) {

        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!


        ListIterator<String> iterator = al.listIterator();
        while (iterator.hasNext()) {
            String o = iterator.next();
            iterator.set(o + "a");
        }
            System.out.println(al);



    }
}
