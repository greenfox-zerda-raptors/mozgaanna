import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mozgaanna on 01/12/16.
 */
public class TestHorse {
    private Horse horse;

    @Before
    public void initTest(){
        horse = new Horse("Paci");
    }

    @Test
    public void testFeed() throws Exception {
        int feedCounterBeforeFeed = horse.getFeedCounter();
        horse.feed();
        int feedCounterAfterFeed = horse.getFeedCounter();
        assertEquals(20, feedCounterAfterFeed - feedCounterBeforeFeed);
    }



    @Test
    public void testFeed2() throws Exception {

    }
}
