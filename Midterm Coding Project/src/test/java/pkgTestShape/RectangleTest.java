package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void getiWidthTest() {
		Rectangle test = new Rectangle(5, 6);
		int width = test.getiWidth();
		assertEquals(5, width);
	}
	
	@Test
	public void setiWidthTest() {
		Rectangle test = new Rectangle(5, 6);
		test.setiWidth(7);
		assertEquals(7, test.getiWidth());
	}
	
	@Test (expected = Exception.class)
	public void setiWidthTest2() throws IllegalArgumentException { 
		Rectangle test = new Rectangle(5, 6);
		test.setiWidth(-2);
	}
	
	@Test
	public void getiLengthTest() {
		Rectangle test = new Rectangle(5, 6);
		int length = test.getiLength();
		assertEquals(6, length);
	}
	
	@Test
	public void setiLengthTest() {
		Rectangle test = new Rectangle(5, 6);
		test.setiLength(8);
		assertEquals(8, test.getiLength());
	}
	
	@Test (expected = Exception.class)
	public void setiLengthTest2() throws IllegalArgumentException { 
		Rectangle test = new Rectangle(5, 6);
		test.setiLength(-2);
	}
	
	@Test
	public void areaTest() {
		Rectangle test = new Rectangle(5, 5);
		test.area();
		assertEquals(25, (test.getiLength() * test.getiWidth()));
	}
	
	@Test
	public void perimeterTest() {
		Rectangle test = new Rectangle(5, 5);
		test.perimeter();
		assertEquals(20, (test.getiLength() * 2) + (test.getiWidth() * 2));
	}
	
	@Test 
	public void compareToTest() {
		Rectangle test = new Rectangle(5, 6);
		Rectangle test1 = new Rectangle(7, 8);
		test.compareTo(test1);
	}
	
	

}
