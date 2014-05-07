package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class A_AboutPrimitives {

	@Test
	public void integersHaveAFairlyLargeRange() {
        int a = 2147483647;
        int b = 2;
		assertEquals(Integer.MIN_VALUE, -2147483648);
		assertEquals(Integer.MAX_VALUE, a);
        assertEquals(Integer.SIZE, 32);
        assertEquals(a+b, -2147483647);
	}

	@Test
	public void longsHaveALargerRangeThanInts() {
        assertEquals(Long.MIN_VALUE, __);
		assertEquals(Long.MAX_VALUE, __);
        assertEquals(Long.SIZE, __);
	}

	@Test
	public void doublesHaveALargeRange() {
		assertEquals(Double.MIN_VALUE, __);
		assertEquals(Double.MAX_VALUE, __);
        assertEquals(Double.SIZE, __);
	}
}
