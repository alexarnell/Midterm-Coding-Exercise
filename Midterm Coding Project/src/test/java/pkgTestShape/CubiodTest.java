package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CubiodTest {

	@Test
	public void getiDepthTest() {
		Cuboid test = new Cuboid(5, 6, 7);
		int depth = test.getiDepth();
		assertEquals(7, depth);
	}
	
	@Test
	public void setiDepthTest() {
		Cuboid test = new Cuboid(5, 6, 7);
		test.setiDepth(8);
		assertEquals(8, test.getiDepth());
	}
	
	@Test (expected = Exception.class)
	public void setiDepthTest2() throws IllegalArgumentException { 
		Cuboid test = new Cuboid(5, 6, 7);
		test.setiDepth(-2);
	}
	
	@Test
	public void volumeTest() {
		Cuboid test = new Cuboid(5, 6, 7);
		test.volume();
		assertEquals(210, (test.getiLength() * test.getiWidth() * test.getiDepth()));
	}
	
	@Test 
	public void areaTest() {
		Cuboid test = new Cuboid(5, 6, 7);
		test.area();
		assertEquals(214, ((2 * (test.getiLength() * test.getiWidth())) + 
				(2 * (test.getiLength() * test.getiDepth()) + 
						(2 *(test.getiDepth() * test.getiWidth())))));
	}
	
	@Test (expected = Exception.class)
	public void perimeterTest() throws UnsupportedOperationException {
		Cuboid test = new Cuboid(5, 6, 7);
		test.perimeter();
	}
	
	@Test 
	public void compareToTest() {
		Cuboid test = new Cuboid(5, 6, 7);
		Cuboid test2 = new Cuboid(8, 9, 10);
		test.compareTo(test2);
		assertEquals(0, test.compareTo(test2));
		
	}

}
