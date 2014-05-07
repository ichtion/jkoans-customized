package beginner;

import org.junit.Test;
import org.junit.*;


import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class A_AboutPrimitives {

	@Test
	public void integersHaveAFairlyLargeRange() {
        int a = 2147483647;
        int b = 2;
		assertEquals(Integer.MIN_VALUE,-2147483648);
		assertEquals(Integer.MAX_VALUE, 2147483647);
        assertEquals(Integer.SIZE, 32);
        assertEquals(a+b, -2147483647);
	}

	@Test
	public void longsHaveALargerRangeThanInts() {
        assertEquals(Long.MIN_VALUE, -9223372036854775808l);
		assertEquals(Long.MAX_VALUE, 9223372036854775807l);
        assertEquals(Long.SIZE, 64);
        
        
	}

	@Test
	public void doublesHaveALargeRange() {
		assertEquals(Double.MIN_VALUE, -4.9E-324, 0.0001);
		assertEquals(Double.MAX_VALUE, 1.7976931348623157E308, 0.00001);
        assertEquals(Double.SIZE, 64);
	}
}
