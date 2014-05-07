package beginner;

import org.junit.Test;

import java.util.*;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;


public class E_AboutCollections {
	
	@Test
	public void usingAnArrayList() {
		List<String> list = new ArrayList<String>();

        list.add("Chicken");
		list.add("Dog");
		list.add("Chicken");

        assertEquals(list.get(0), "Chicken");
		assertEquals(list.get(1), "Dog");
		assertEquals(list.get(2), "Chicken");
	}
	
	@Test
	public void usingABasicSet() {
		Set<String> set = new HashSet<String>();

        set.add("Dog");
		set.add("Cat");
		set.add("Dog");

        assertEquals(set.size(), 2);
		assertEquals(set.contains("Dog"), true);
		assertEquals(set.contains("Cat"), true);
		assertEquals(set.contains("Chicken"), false);
	}
	
	@Test
	public void usingABasicMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

        assertEquals(map.size(), 3);
		assertEquals(map.containsKey("one"), true);
		assertEquals(map.containsKey("two"), true);
		assertEquals(map.containsValue(3), true);
		assertEquals(map.get("one"), new Integer(1));
	}
}
