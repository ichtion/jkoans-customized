package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class Y_AboutInheritance {

	class Figure {
		public String getDimension() { return "the default dimension for figure is 2"; }
	}
	
	class Square extends Figure {
		
		@Override
		public String getDimension() { return "square with dimension 2"; }
		
		
		public String getDimension(String s) { return s; }
	}
	
	@Test
	public void differenceBetweenOverloadingAndOverriding() {
		assertEquals(new Figure().getDimension(),"the default dimension for figure is 2");
		assertEquals(new Square().getDimension(),"square with dimension 2");
		assertEquals(new Square().getDimension("oh no"), "oh no");
	}
	
}
