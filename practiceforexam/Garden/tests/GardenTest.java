import static org.junit.Assert.*;

/**
 * Created by mozgaanna on 05/12/16.
 */
public class GardenTest {
    Garden g;

    @org.junit.Before
    public void setUp() throws Exception {
        g = new Garden();
        g.addPlant(new Flower("Anyad"));
    }

    @org.junit.Test
    public void water() throws Exception {
        String expectedBefore = "The Anyad flower needs water\n";
        String expectedAfter = "The Anyad flower doesn't need water\n";
        assertEquals(expectedBefore, g.toString());
        g.water(8);
        assertEquals(expectedAfter, g.toString());


    }

}