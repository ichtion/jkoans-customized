package beginner;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class B_AboutObjects {

	@Test
	public void newObjectInstancesCanBeCreatedDirectly() {
		assertEquals(new Object() instanceof Object, true);
	}

	@Test
	public void allClassesInheritFromObject() {
		class Foo {}

		Class<?>[] ancestors = getAncestors(new Foo());
		assertEquals(ancestors[0], Foo.class);
		assertEquals(ancestors[1], Object.class);
	}

	private Class<?>[] getAncestors(Object object) {
		List<Class<?>> ancestors = new ArrayList<Class<?>>();
		Class<?> clazz = object.getClass();
		while(clazz != null) {
			ancestors.add(clazz);
			clazz = clazz.getSuperclass();	
		}
		return ancestors.toArray(new Class[]{});	
	}
	
}
