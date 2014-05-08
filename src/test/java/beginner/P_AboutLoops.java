package beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_AboutLoops {

	@Test
	public void basicForLoop() {
		String s = "";
		for(int i = 0; i < 5; i++) {
			s = s + i + " ";
		}
		assertEquals(s, "0 1 2 3 4 ");
	}
	
	@Test
	public void extendedForLoop() {
		int[] list = {1,2,3,4};
		String s = "-";
		for(int j : list) {
			s = s + "." + j;
		}
		assertEquals(s, "-.1.2.3.4");
	}
	
	@Test
	public void whileLoop() {
		int result = 0;
		while(result < 3) {
			result++;
		}
		assertEquals(result, 3);
	}
	
}
