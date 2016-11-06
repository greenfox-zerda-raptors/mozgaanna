/**
 * Created by mozgaanna on 06/11/16.
 */
public class Workshop22 {
    public static void printStrings(String... args){
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        printStrings("sfasdf", "asdfsd", "sdf", "adsfasdfasdfsa", "sfdfsdgsf", "f", "sdf");

        System.out.println();
    }
}
