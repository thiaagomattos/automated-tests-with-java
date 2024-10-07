package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_WhenSixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        
        assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
            assertNotEquals(9.2, actual);
            assertNotNull(actual);
      }
    

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
    	SimpleMath math = new SimpleMath(); {
    		double firstNumber = 6.2D;
            double secondNumber = 2D;
            Double actual = math.subtraction(firstNumber, secondNumber);
            double expected = 4.2D;
            
            assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
            assertNotEquals(9.2, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {
    	SimpleMath math = new SimpleMath(); {
    		double firstNumber = 6.2;
    		double secondNumber = 2D;
    		Double actual = math.multiplication(firstNumber, secondNumber);
    		double expected = 12.4D;
    		
    		assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
    	SimpleMath math = new SimpleMath(); {
    		double firstNumber = 6.2;
    		double secondNumber = 2D;
    		Double actual = math.division(firstNumber, secondNumber);
    		double expected = 3.1D;
    		
    		assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    	
    @Test
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
    		fail();
    }
    
    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4")
    void testMean() {
    	SimpleMath math = new SimpleMath(); {
    		double firstNumber = 6.2;
    		double secondNumber = 2D;
    		Double actual = math.mean(firstNumber, secondNumber);
    		double expected = 4.1D;
    		
    		assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")" + " /2 " + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    void testSquareRoot() {
    	SimpleMath math = new SimpleMath(); {
    		double number = 16D;
    		Double actual = math.squareRoot(number);
    		double expected = 4D;
    		
    		assertEquals(expected, actual, () -> "Square Root of " + number + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
}