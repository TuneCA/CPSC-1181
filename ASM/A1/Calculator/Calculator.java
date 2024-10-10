import java.util.Arrays;

/**
 * 
 *
 * A simple class that contains many common methods used for performing
 * various computations. These methods may or may not be correct. We
 * should add a test class to check the validity of these methods.
 * 
 * @author Tat Tung Nguyen
 * 
 */

public class Calculator {
	/**
	 * Calculates the remainder of the division between two integers.
	 * 
	 * @param a the dividend
	 * @param b the divisor
	 * @return the remainder when a is divided by b
	 * @throws ArithmeticException if the divisor is 0
	 */
	public static int remainder(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("The second value can not be zero.");
		}
		return a % b;
	}

	/**
	 * Adds two double numbers.
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return the sum of a and b
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * Multiplies two double numbers.
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return the product of a and b
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * Subtracts the second number from the first.
	 * 
	 * @param a the number to be subtracted from
	 * @param b the number to subtract
	 * @return the result of subtracting b from a
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}

	/**
	 * Divides the first number by the second.
	 * 
	 * @param a the dividend
	 * @param b the divisor
	 * @return the result of dividing a by b
	 */
	public static double divide(double a, double b) {
		return a / b;
	}

	/**
	 * Calculates the average (mean) of a series of double values.
	 * 
	 * @param values the values to average
	 * @return the average of the values, or 0 if the input is null or empty
	 */
	public static int average(double... values) {
		if (values == null || values.length == 0) {
			return 0;
		}
		int sum = 0;
		for (double n : values) {
			sum += n;
		}
		return sum / values.length;
	}

	// calculate arithmetic median
	// he median of a finite list of numbers can be found
	// by arranging all the numbers from smallest to greatest.
	// If there is an odd number of numbers, the middle one is
	// picked. If there is an even number of observations, then
	// there is no single middle value; the median is then usually
	// defined to be the mean of the two middle values
	/**
	 * Calculates the median of a series of double values.
	 * The median is the middle value when the numbers are sorted.
	 * If there is an even number of values, the median is the mean
	 * of the two middle values.
	 * 
	 * @param values the values to find the median of
	 * @return the median of the values, or 0 if the input is null or empty
	 */
	public static double median(double... values) {
		if (values == null || values.length == 0) {
			return 0;
		}
		Arrays.sort(values);
		return values[values.length / 2];

	}

	/**
	 * Finds the maximum value from a series of double values.
	 * 
	 * @param values the values to find the maximum of
	 * @return the maximum value, or 0 if the input is null or empty
	 */
	public static double max(double... values) {
		double max = 0;
		if (values != null) {
			if (values.length > 0) {
				max = values[0];
				for (int i = 1; i < values.length; i++) {
					if (values[i] > max)
						max = values[i];
				}
			}
		}
		return max;
	}

	/**
	 * Finds the minimum value from a series of double values.
	 * 
	 * @param values the values to find the minimum of
	 * @return the minimum value, or 0 if the input is null or empty
	 */
	public static double min(double... values) {
		double min = 0;
		if (values != null) {
			if (values.length > 0) {
				min = values[0];
				for (int i = 1; i < values.length; i++) {
					if (values[i] < min)
						min = values[i];
				}
			}
		}
		return min;
	}
}
