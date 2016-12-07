/**
 * Created by mozgaanna on 06/12/16.
 */
public class NumberConverter {


    public static String arabicToRoman(int arabic) {
        StringBuilder myString = new StringBuilder();
        String[] symbols = new String[] {"M", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[] {1000, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int remaining = arabic;

        for (int i= 0; i < symbols.length; i++) {
            remaining = appendSymbols(remaining, values[i], symbols[i], myString);
        }
        //a sok remaining helyett van a fenti for loop

//        remaining = appendSymbols(remaining, 1000, "M", myString);
//        remaining = appendSymbols(remaining, 100, "C", myString);
//        remaining = appendSymbols(remaining, 50, "L", myString);
//        remaining = appendSymbols(remaining, 40, "XL", myString);
//        remaining = appendSymbols(remaining, 10, "X", myString);
//        remaining = appendSymbols(remaining, 9, "IX", myString);
//        remaining = appendSymbols(remaining, 5, "V", myString);
//        remaining = appendSymbols(remaining, 4, "IV", myString);

//first solution
//        for (int i = 0; i < remaining; i++ ){
//            myString.append("I");
//        }


        return myString.toString();
    }

    public static int appendSymbols(int remaining, int number, String symbol, StringBuilder myString) {
        while (remaining >= number) {
            myString.append(symbol);
            remaining -= number;
        }
        return remaining;
    }
}

