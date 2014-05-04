package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class O_AboutOperators {

	@Test
	public void plusPlusVariablePlusPlus(){
		int i = 1;
		assertEquals(++i,__);
		assertEquals(i,__);
		assertEquals(i++,__);
		assertEquals(i,__);
	}
	
	@Test
	public void shortCircuitOr_1() {
		int i = 1;
		if ( true || (++i < 8)  )  i = i + 1;
		assertEquals(i,__);
	}

    @Test
    public void shortCircuitOr_2() {
        int i = 1;
        int a = 6;
        if ( (++i < 8) || (a < 9 ) )  i = i + 1;
        assertEquals(i,__);
    }

	@Test
	public void shortCircuitAnd_1(){
		int i = 1;
		if ( false && (++i < -28)  )  i = i + 1;
		assertEquals(i,__);
	}
	
	@Test
	public void dontMistakeEqualsForEqualsEquals() {
		int i = 1;
		boolean a = false;
		if (a = true)  i++;
		assertEquals(a, __);
		assertEquals(i,__);
		// How could you write the condition 'with a twist' to avoid this trap?
	}
	
}
