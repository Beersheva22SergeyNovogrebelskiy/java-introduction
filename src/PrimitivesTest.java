import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Disabled
	@Test
	void dataTypeTest() {
		int b = 10;
		short a = 20;
		char c = 'd';
		long l = (long) 10.1;
		byte b1 = (byte) 1000;
		a = (short) l;
		float f = 10.2f;
		int b2 = 0xffffffff;
		assertEquals(10, a);
	}

	@Disabled
	@Test
	void operatotTest() {
		int number = 123;
		assertEquals(3, getTirdDigit(number));
		assertEquals(2, getSecondDigit(number));
		assertEquals(1, getFirstDigit(number));
	}

	private Integer getFirstDigit(int number) {
		return number / 100 % 10;
	}

	private Integer getSecondDigit(int number) {
		return number / 10 % 10;
	}

	private Integer getTirdDigit(int number) {
		return number % 10;
	}
	
}
