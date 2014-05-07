package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class M_AboutEquality {

	@Test
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(object == sameObject, true);
		assertEquals(object == new Object(), false);
	}

	@Test
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertEquals(object.equals(object), true);
		assertEquals(object.equals(new Object()), false);
	}

	@Test
	public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertEquals(object.equals(object), true);
		assertEquals(object.equals(new Integer(1)), true);
	}

	@Test
	public void objectsNeverEqualNull(){
		assertEquals(new Object().equals(null), false);
	}

	@Test
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(obj.equals(obj), true);
	}
}
