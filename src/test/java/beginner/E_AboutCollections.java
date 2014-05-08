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

        assertEquals(list.get(0), A);
		assertEquals(list.get(1), __);
		assertEquals(list.get(2), __);
	}
	
	@Test
	public void usingABasicSet() {
		Set<String> set = new HashSet<String>();

        set.add("Dog");
		set.add("Cat");
		set.add("Dog");

        assertEquals(set.size(), __);
		assertEquals(set.contains("Dog"), __);
		assertEquals(set.contains("Cat"), __);
		assertEquals(set.contains("Chicken"), __);
	}
	
	@Test
	public void usingABasicMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

        assertEquals(map.size(), __);
		assertEquals(map.containsKey("one"), __);
		assertEquals(map.containsKey("two"), __);
		assertEquals(map.containsValue(3), __);
		assertEquals(map.get("one"), __);
	}
}
