import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mozgaanna on 21/11/16.
 */
public class TestAnnaMozga {
//    @Test
//    public void countHowManyVowels() throws Exception {
//        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
//
//    }

    @Test
    public void countHowMany() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(3, (wSource.countHowMany('a')));

        assertEquals(0, (wSource.countHowMany('x')));
    }


    @Test
    public void main() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(3, (wSource.countHowMany('a')));

        assertEquals(0, (wSource.countHowMany('x')));
    }
}
