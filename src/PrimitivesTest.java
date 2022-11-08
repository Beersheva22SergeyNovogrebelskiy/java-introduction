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
	
	@Test
	@Disabled
	void getBitValueTest() {
		long number = 0x3ab7f5; // 001110101011011111_1_1010_1
		assertEquals(1, BitOperations.getBitValue(number, 5));
		assertEquals(0, BitOperations.getBitValue(number, 11));
		assertEquals(0, BitOperations.getBitValue(number, 1));
		assertEquals(1, BitOperations.getBitValue(number, 2));
		assertEquals(-1, BitOperations.getBitValue(number, 100));
		assertEquals(-1, BitOperations.getBitValue(number, -2));
	}
	
	@Test
	@Disabled
	void setBitValueTest() {
		long number = 0x3ab7f5; // 001110101011011111_1_10101
		assertEquals(0x3ab7d5, BitOperations.setBitValue(number, 5, false));
		assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 5, true));
	}
	
	@Test
	@Disabled
	void reverBitValueTest() {
		long number = 0x3ab7f5; // 001110101011011111_1_10101
		assertEquals(0x3ab7d5, BitOperations.revertBitValue(number, 5));
		assertEquals(0x3ab7f4, BitOperations.revertBitValue(number, 0));
	}
	
	@Test
	@Disabled
	void test() {
	long number = -1;
	assertEquals(1, BitOperations.getBitValue(number, 63));
	number = BitOperations.revertBitValue(number, 63);
	assertEquals(0, BitOperations.getBitValue(number, 63));
	}
	
	@Test
	void digitsNumberTest() {
		assertEquals(16, BitOperations.onesInNumber(0x3ab7f5));
		assertEquals(1, BitOperations.onesInNumber(0x1));
	}
	
	@Test
	void leadingZerosTest() {
		assertEquals(42, BitOperations.leadingZeros(0x3ab7f5));
		assertEquals(63, BitOperations.leadingZeros(0x1));
	}
	@Test
	void isHappyNumberTest() {
	assertEquals(true, Numbers.sHappyNumber(123015));
	}
	
}
