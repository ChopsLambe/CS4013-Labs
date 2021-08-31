package lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TTDTest {

	@CsvSource({
		"4, 2, 2",
		"9, 3, 3",
		"8, 2, 4",
		"10, 5, 2",
		"7, 10, 2",})
	@ParameterizedTest
	void testDivide(int x, int y, int z) {
		TTD t = new TTD();
		assertEquals(t.divide(x, y), z);
		
	}

	@CsvSource({
		"2, 4",
		"3, 9",
		"1, 1",
		"4, 98",
		"0, 0",})
	@ParameterizedTest
	void testPower(int x, int y) {
		TTD t = new TTD();
		assertEquals(t.power(x), y);
	}

}
