package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class C_AboutStrings {

	@Test
	public void implicitStrings() {
		assertEquals("just a plain ole string".getClass(), __);
	}

	@Test
	public void newStringIsRedundant() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(stringInstance.equals(stringReference), __);
	}

	@Test
	public void newStringIsNotIdentical() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(stringInstance == stringReference, __);
	}

	@Test
	public void stringConcatenation() {
		String one = "one";
		String space = " ";
		String two = "two";
		assertEquals(one + space + two, __);
	}

	@Test
	public void efficientStringConcatenation() {
		// the above implicit string concatenation looks nice - but, it is expensive.
		// it creates a new string instance on each concatenation. here's a better alternative:
		assertEquals(new StringBuilder("one").append(" ").append("two").toString(), __);
	}

}
