import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//This is not a complete test class, but demonstrates the basic tests needed as well as how to test for exceptions that should be thorwn. 
public class TestRectangle {

	@Test
	void testConstructor() {
		Rectangle r = new Rectangle(2,5,"white");
		assertEquals(2,r.getWidth());
		assertEquals(5,r.getLength());
		assertEquals("white",r.getColor());
		
		try {
			Rectangle rError = new Rectangle(-3,3,"");
			fail("Constructor should throw exception for neg width");
		} catch (IllegalArgumentException e) {}
		
		try {
			Rectangle rError = new Rectangle(3,-3,"");
			fail("Constructor should throw exception for neg length");
		} catch (IllegalArgumentException e) {}

		try {
			Rectangle rError = new Rectangle(3,3,null);
			fail("Constructor should throw exception for null Color");
		} catch (NullPointerException e) {}
		//etc.
	}

	@Test
	void testGettersAndSetters() {
		Rectangle r = new Rectangle(2,5,"white");
		r.setWidth(20);
		assertEquals(20,r.getWidth());
		try {
			r.setWidth(-10);
			fail("Setter should throw exception for neg width");
		} catch (IllegalArgumentException e) {}		
	}

	@Test
	void testGetArea() {
		Rectangle r = new Rectangle(2,5,"white");
		assertEquals(10,r.getArea());
	}

	@Test
	void testIsLarger() {
		Rectangle r1 = new Rectangle(5,10,"white");
		Rectangle r2 = new Rectangle(2, 25, "black");
		Rectangle r3 = new Rectangle(1,2,"red");
		
		assertEquals(true,r1.isLargerThan(r3));
		assertTrue(r1.isLargerThan(r3));
		
		try {
			r1.isLargerThan(null);
			fail("should throw exception for null parameter");
		} catch (NullPointerException e) {}

	}
	
}
