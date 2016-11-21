import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by mozgaanna on 21/11/16.
 */
public class AppleTest {
    @Test
    public void sumAll() throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(21, Apple.sumAll(numbers));
    }

    @Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("Apple", myObject.getName());

    }

}