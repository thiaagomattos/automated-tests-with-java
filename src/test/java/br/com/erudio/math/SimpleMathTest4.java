package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest4 {

	SimpleMath math = new SimpleMath();

	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Pelé", "Senna", "John"})
	void testValeuSource(String firstName) {
		System.out.println(firstName);
		assertNotNull(firstName);
	}
	
	@DisplayName("Test 6.2 / 2 = 3.1")
	@ParameterizedTest
	//@MethodSource("testDivisionInputParameters")
	//@MethodSource()
	/**@CsvSource({
		"6.2, 2, 3.1",
		"71, 14, 5.07",
		"18.3, 3.1, 5.90"
	})*/
	@CsvFileSource(resources = "/testDivision.csv")
	void testDivision(double firstNumber, double secondNumber, double expected) {
		
		Double actual = math.division(firstNumber, secondNumber);

		assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber + " did not produce " + expected + " !");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	//public static Stream<Arguments> testDivisionInputParameters() {
	/*public static Stream<Arguments> testDivision() {
		return Stream.of(
			Arguments.of(6.2D, 2D, 3.1D),
			Arguments.of(71D, 14D, 5.07D),
			Arguments.of(18.3D, 3.1D, 5.90D)
		);
	}*/
}