import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SlowFlakyTest114 {
    @Test
    public void testFlaky1() {
        assertTrue(new Stupid1OutOf10().isLargerThan(2));
    }

    @Test
    public void testFlaky2() {
        assertTrue(new Stupid1OutOf10().isLargerThan(1));
    }

    @Test
    public void testFlaky3() {
        assertTrue(new Stupid1OutOf10().isLargerThan(1));
    }

    @Test
    public void testFlaky4() {
        assertTrue(new Stupid1OutOf10().isLargerThan(1));
    }

    @Test
    public void testFlaky5() {
        assertTrue(new Stupid1OutOf10().isLargerThan(1));
    }

    @Test
    public void testFlaky6() {
        assertTrue(new Stupid1OutOf10().isLargerThan(1));
    }
}
