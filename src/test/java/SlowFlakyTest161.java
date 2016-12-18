import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SlowFlakyTest161 {
    @Test
    public void testFlaky1() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 2);
    }

    @Test
    public void testFlaky2() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }

    @Test
    public void testFlaky3() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }

    @Test
    public void testFlaky4() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }

    @Test
    public void testFlaky5() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }

    @Test
    public void testFlaky6() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }
}
