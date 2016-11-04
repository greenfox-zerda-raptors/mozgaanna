/**
 * Created by mozgaanna on 03/11/16.
 */
public class Workshop22 {
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable

//        String comparisonResult = "true";
//        if (first.length() > second.length()) {
//            } else {
//            comparisonResult = "false";
//        }
        boolean firstIsBigger = (first.length() > second.length());
        if (firstIsBigger) {
            System.out.println("The first is longer!");
        }
        else {
            System.out.println("The second is longer!");
        }
    }
}
