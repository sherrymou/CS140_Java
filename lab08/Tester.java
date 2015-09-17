package lab08;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
	@Test
	public void testQ1() {
		Count obj = new Count(3);
		assertEquals(3,obj.getCount());
		obj.add();
		obj.add();
		assertEquals(5,obj.getCount());
		
	}
	

	@Test
	public void testQ2() {
		int[] a = new int[] {1,5,4,3};
		int[] b = new int[] {1,3,4,5};
		int[] c = new int[] {5,4,3,1};
		Ar.sort(a);
		assertArrayEquals(b,a);
		Ar.reverse(a);
		assertArrayEquals(c,a);
		
		
		
	}

}
