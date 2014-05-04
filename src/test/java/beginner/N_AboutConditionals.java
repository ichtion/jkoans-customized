package beginner;


import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class N_AboutConditionals {

	@Test
	public void ifAsIntended() {
		boolean condition = true;
		int x = 1;
		if(condition) {
			x++;
		} else {
			x = 0;
		}
		assertEquals(x,__);
	} 
	
}
