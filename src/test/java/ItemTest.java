
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 01/10/15.
 */
public class ItemTest {

    @Test
    public void testDailyUpdate() throws Exception {
        AgedBrie t = new AgedBrie(15,20);
        assertTrue((t.getQuality()<10));

    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testUpdateQuality() throws Exception {

    }
}