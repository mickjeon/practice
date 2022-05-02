import org.junit.*;
import static org.junit.Assert.*;

public class PracticeTester {
    @Test
    public void testMultiply() {
        assertEquals(10, Practice.multiply(2, 5));
    }
}
