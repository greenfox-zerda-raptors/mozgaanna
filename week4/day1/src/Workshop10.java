/**
 * Created by mozgaanna on 07/11/16.
 */
import java.util.*;

public class Workshop10{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "sixth", "third", "fourth", "fifth"));
        // Accidentally I added "sixth" instead of "second"! Your task is to swap "sixth" with "second"

        list.set(list.indexOf("sixth"), "second");

        System.out.println(list);
    }
}
