package beginner;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class B_AboutObjects {

	@Test
	public void newObjectInstancesCanBeCreatedDirectly() {
		assertEquals(new Object() instanceof Object, __);
	}

	@Test
	public void allClassesInheritFromObject() {
		class Foo {}

		Class<?>[] ancestors = getAncestors(new Foo());
		assertEquals(ancestors[0], Foo.class);
		assertEquals(ancestors[1], Object.class);
	}

	@Test
	public void objectToString() {
		Object object = new Object();
		// TODO: Why is it best practice to ALWAYS override toString?
		String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
		assertEquals(expectedToString, __); // hint: object.toString()
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
