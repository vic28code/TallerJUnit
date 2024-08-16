package proyecto;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculation {
	@Test
    public void testFindMaxWithPositiveAndNegativeNumbers() {
        assertEquals(4, Calculation.findMax(new int[] {1, 2, 3, 4}));
        assertEquals(-1, Calculation.findMax(new int[] {-12, -1, -3, -4, -2}));
        assertEquals(10, Calculation.findMax(new int[] {-10, -5, 0, 3, 10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        Calculation.findMax(new int[] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        Calculation.findMax(null);
    }
}
