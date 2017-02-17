import java.util.ArrayList;

/**
 * Created by mozgaanna on 17/02/17.
 */
public class Exercise14II {


    public static ArrayList<String> splitting(String input){
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> splittedString = new ArrayList<>();

        input = input.concat(", ");
            //nem kell az index miatt aggodni
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) != ',' || i == input.length()-1 ) {
                stringBuilder.append(input.charAt(i));
            } else {
                splittedString.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        return splittedString;
    }

    public static void main(String[] args) {
        String input = "a,bcd,e,fgh";
        System.out.println(splitting(input));
    }
}
