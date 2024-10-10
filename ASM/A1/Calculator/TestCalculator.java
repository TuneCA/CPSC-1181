import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * A class for testing the methods of the Calculator class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 * 
 * @author Tat Tung Nguyen
 * 
 */

class TestCalculator {

	@Test
	void testRemainder() {
		assertEquals(1, Calculator.remainder(10, 3));
		assertEquals(0, Calculator.remainder(20, 5));
		assertEquals(-1, Calculator.remainder(-10, 3));
		assertEquals(2, Calculator.remainder(7, 5));
		assertEquals(0, Calculator.remainder(0, 1));
		try {
			Calculator.remainder(12, 0);
			fail("Expected an ArithmeticException");
		} catch (ArithmeticException e) {
			assertEquals("The second value can not be zero.", e.getMessage());
		}
	}

	@Test
	void testAdd() {
		assertEquals(15, Calculator.add(10, 5));
		assertEquals(16, Calculator.add(37, -21));
		assertEquals(15.3, Calculator.add(14.9, 0.4), 1E-10);
		assertEquals(20.0001, Calculator.add(20, 0.0001), 1E-10);
		assertEquals(-5, Calculator.add(0, -5));
	}

	@Test
	void testMultiply() {
		assertEquals(15, Calculator.multiply(3, 5));
		assertEquals(-6, Calculator.multiply(-2, 3));
		assertEquals(9.9, Calculator.multiply(3.3, 3.0), 1E-10);
		assertEquals(0, Calculator.multiply(0, 5));
		assertEquals(15.0, Calculator.multiply(-3.0, -5.0), 1E-10);
	}

	@Test
	void testSubtract() {
		assertEquals(10, Calculator.subtract(15, 5));
		assertEquals(-5, Calculator.subtract(20, 25));
		assertEquals(-20, Calculator.subtract(0, 20));
		assertEquals(19.9, Calculator.subtract(20, 0.1), 1E-10);
		assertEquals(19.999999, Calculator.subtract(20, 0.000001), 1E-10);
	}

	@Test
	void testDivide() {
		assertEquals(3.0, Calculator.divide(15.0, 5.0), 1E-10);
		assertEquals(-5.0, Calculator.divide(15.0, -3.0), 1E-10);
		assertEquals(-5.0, Calculator.divide(-15.0, 3.0), 1E-10);
		assertEquals(5.5, Calculator.divide(11.0, 2.0), 1E-10);
		assertEquals(4.01, Calculator.divide(16.04, 4.0), 1E-10);
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(10.0, 0.0), 1E-10);
	}

	@Test
	void testAverage() {
		assertEquals(3, Calculator.average(1, 2, 3, 4, 5));
		assertEquals(2, Calculator.average(1.1, 2.1, 3.1, 4.1), 1E-10);
		assertEquals(-3, Calculator.average(-2, -3, -4));
		assertEquals(2, Calculator.average(2, -3, 4, 5, -6, 10));
		assertEquals(1, Calculator.average(1));
		assertEquals(0, Calculator.average(null));
	}

	@Test
	void testMedian() {
		assertEquals(3, Calculator.median(2, 3, 4, 5, 2, 3, 3));
		assertEquals(5, Calculator.median(2, 4, 3, 5, 7, 8));
		assertEquals(4.5, Calculator.median(2.3, 4.5, 1.1, 6.4), 1E-10);
		assertEquals(4, Calculator.median(-2, 4, -6, 5, 7, 1));
		assertEquals(-2.01, Calculator.median(-2.01, -3, -5, -6, 1, 0));
		assertEquals(0, Calculator.median(null));
	}

	@Test
	void testMax() {
		assertEquals(5, Calculator.max(1, 2, 3, 4, 5));
		assertEquals(-1, Calculator.max(-5, -4, -3, -2, -1));
		assertEquals(4.5, Calculator.max(1.1, 2.2, 3.3, 4.5), 1E-10);
		assertEquals(1, Calculator.max(1));
		assertEquals(0, Calculator.max(null));
	}

	@Test
	void testMin() {
		assertEquals(1, Calculator.min(1, 2, 3, 4, 5));
		assertEquals(-5, Calculator.min(-5, -4, -3, -2, -1));
		assertEquals(1.1, Calculator.min(1.1, 2.2, 3.3, 4.5), 1E-10);
		assertEquals(0, Calculator.min(0));
		assertEquals(-6, Calculator.min(-6, -5, -4, -3, -2));
		assertEquals(0, Calculator.min(null));
	}
}
