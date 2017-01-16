/**
 * Created by mozgaanna on 08/11/16.
 */
import java.util.*;

public class Workshop15 {
    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));
        // Add "a" to every string in al. Use a for(each) loop


        // Misi said it is okay this way!
        ListIterator<String> iterator = al.listIterator();
        while (iterator.hasNext()){
            String o = iterator.next();
            iterator.set(o + "a");
        }
            System.out.println(al);

    }
}

