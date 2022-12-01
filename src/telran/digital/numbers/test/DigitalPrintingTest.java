package telran.digital.numbers.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telran.digital.numbers.DigitalNumbersPrinting.*;

public class DigitalPrintingTest {
	@Test
	@Disabled
	void lineTest() {
		System.out.println(line(30, 30));
	}
	@Test
	@Disabled
	void verticalLineTest() {
		displayStrings(verticalLine(30, 5));
	}
	@Test
	@Disabled
	void twoVerticalLinesTest() {
		displayStrings(twoVerticalLines(30, 10, 5));
	}
	@Test
	@Disabled
	void zeroTest() {
		displayStrings(zero(30, 5, 5));
	}
	@Test
	@Disabled
	void oneTest() {
		displayStrings(one(30, 5, 5));
	}
	@Test
	void displayDigitalNumberTest() {
		displayDigitalNumber(1428739560, 2, 5, 5);
	}
	
}