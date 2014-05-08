package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class O_AboutOperators {

	@Test
	public void plusPlusVariablePlusPlus(){
		int i = 1;
		assertEquals(++i,2);
		assertEquals(i,2);
		assertEquals(i++,2);
		assertEquals(i,3);
	}
	
	@Test
	public void shortCircuitOr_1() {
		int i = 1;
		if ( true || (++i < 8)  )  i = i + 1;
		assertEquals(i,2);
	}

    @Test
    public void shortCircuitOr_2() {
        int i = 1;
        if ( (++i < 8) || (++i < 9 ) )  i = i + 1;
        assertEquals(i,3);
    }

	@Test
	public void shortCircuitAnd_1(){
		int i = 1;
		if ( false && (++i < -28)  )  i = i + 1;
		assertEquals(i,1);
	}
	
	@Test
	public void dontMistakeEqualsForEqualsEquals() {
		int i = 1;
		boolean a = false;
		if (a = true)  i++;
		assertEquals(a, true);
		assertEquals(i,2);
		// How could you write the condition 'with a twist' to avoid this trap?
	}
	
}
