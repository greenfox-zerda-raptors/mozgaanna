import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by mozgaanna on 21/11/16.
 */
public class FibonacciTest {
    @Test
    public void main() throws Exception {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    public void fibonacci() throws Exception {

    }
}
