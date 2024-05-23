import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestNew1 {
    @Test
    public void testSum() {
        List<Integer> numbers = Arrays.asList(2, 3, 3, 7, 10000000);
        assertEquals(10000015, Main._sum(numbers));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 8, 9);
        assertEquals(2592, Main._mult(numbers));
    }

    @Test
    public void testMin() {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 56, 8, 9, 0, -1);
        assertEquals(-1, Main._min(numbers));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = Arrays.asList(2, 3, 1, 1, 3, 4, 5, 6, 7, 10000000);
        assertEquals(10000000, Main._max(numbers));
    }
}
