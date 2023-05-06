package com.Calculator.StringCalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class StringCalculatorApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}
// StringCalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorApplicationTests {

	private final StringCalculatorApplication calculator = new StringCalculatorApplication();

	@Test
	void testEmptyString() {
		assertEquals(0, calculator.add(""));
	}

	@Test
	void testSingleNumber() {
		assertEquals(1, calculator.add("1"));
	}

	@Test
	void testTwoNumbers() {
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
	void testUnknownAmountOfNumbers() {
		assertEquals(15, calculator.add("1,2,3,4,5"));
	}

	@Test
	void testNewLineDelimiter() {
		assertEquals(6, calculator.add("1\n2,3"));
	}

	@Test
	void testCustomDelimiter() {
		assertEquals(3, calculator.add("//;\n1;2"));
	}

	@Test
	void testNegativeNumberException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,2"));
		assertEquals("negatives not allowed: -1", exception.getMessage());
	}

	@Test
	void testMultipleNegativeNumbersException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,-2,3"));
		assertEquals("negatives not allowed: -1,-2", exception.getMessage());
	}
}
