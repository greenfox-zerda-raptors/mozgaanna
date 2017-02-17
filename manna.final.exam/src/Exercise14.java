import java.util.Arrays;

/**
 * Created by mozgaanna on 17/02/17.
 */
public class Exercise14 {

    public static void splitting(){
        String input = "a,bcd,e,fgh";
        String[] output = input.split(",");
        System.out.println(input);
        System.out.print(Arrays.toString(output));
    }

    public static void main(String[] args){
        splitting();
    }
}
