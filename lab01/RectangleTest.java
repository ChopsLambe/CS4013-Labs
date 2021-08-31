package lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class rectangleTest {

	@Test
	void testRectangleDoubleDouble() {
		fail("Not yet implemented");
	}
	
	@CsvSource({"1"})
	@ParameterizedTest
	void testGetArea(int x) {
		rectangle r = new rectangle();
		assertEquals(r.getArea(), x);
	}

	@CsvSource({"4", "4"})
	@ParameterizedTest
	void testGetPerimeter(int x) {
		rectangle r = new rectangle();
		assertEquals(r.getPerimeter(), x );
	}

}
