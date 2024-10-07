package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSum() {
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
    void testSubtraction() {
    	SimpleMath math2 = new SimpleMath(); {
    		double firstNumber = 6.2D;
            double secondNumber = 2D;
            Double actual = math2.subtraction(firstNumber, secondNumber);
            double expected = 4.2D;
            
            assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
            assertNotEquals(9.2, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    void testMultiplication() {
    	SimpleMath math3 = new SimpleMath(); {
    		double firstNumber = 5D;
    		double secondNumber = 2D;
    		Double actual = math3.multiplication(firstNumber, secondNumber);
    		double expected = 10D;
    		
    		assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    void testDivision() {
    	SimpleMath math4 = new SimpleMath(); {
    		double firstNumber = 10D;
    		double secondNumber = 2D;
    		Double actual = math4.division(firstNumber, secondNumber);
    		double expected = 5D;
    		
    		assertEquals(expected, actual, () -> firstNumber + ":" + secondNumber + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    void testMean() {
    	SimpleMath math5 = new SimpleMath(); {
    		double firstNumber = 10D;
    		double secondNumber = 2D;
    		Double actual = math5.mean(firstNumber, secondNumber);
    		double expected = 6D;
    		
    		assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")" + " /2 " + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
    
    @Test
    void testSquareRoot() {
    	SimpleMath math6 = new SimpleMath(); {
    		double number = 16D;
    		Double actual = math6.squareRoot(number);
    		double expected = 4D;
    		
    		assertEquals(expected, actual, () -> "Square Root of " + number + " did not produce " + expected + " !");
    		assertNotEquals(9.2D, actual);
            assertNotNull(actual);
    	}
    }
}