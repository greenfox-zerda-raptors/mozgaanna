import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mozgaanna on 21/11/16.
 */
public class Apple {

    String name = "Apple";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(sumAll(numbers));
    }


    public static int sumAll(ArrayList <Integer> numbers){
        int result = 0;
        for (Integer i : numbers ){
            result += i;
        }
        return result;
    }


}
