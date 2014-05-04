package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class M_AboutEquality {

	@Test
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(object == sameObject, __);
		assertEquals(object == new Object(), __);
	}

	@Test
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertEquals(object.equals(object), __);
		assertEquals(object.equals(new Object()), __);
	}

	@Test
	public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertEquals(object.equals(object), __);
		assertEquals(object.equals(new Integer(1)), __);
	}

	@Test
	public void objectsNeverEqualNull(){
		assertEquals(new Object().equals(null), __);
	}

	@Test
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(obj.equals(obj), __);
	}
}
