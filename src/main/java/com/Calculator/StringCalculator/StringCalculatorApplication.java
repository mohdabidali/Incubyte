package com.Calculator.StringCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class StringCalculatorApplication {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",";
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf('\n');
			delimiter = numbers.substring(2, delimiterIndex);
			numbers = numbers.substring(delimiterIndex + 1);
		}

		String[] splitNumbers = numbers.split(delimiter + "|\n");
		int sum = 0;
		StringBuilder negatives = new StringBuilder();

		for (String num : splitNumbers) {
			int number = Integer.parseInt(num);
			if (number < 0) {
				negatives.append(number).append(",");
			}
			sum += number;
		}

		if (negatives.length() > 0) {
			throw new IllegalArgumentException("negatives not allowed: " + negatives.toString().substring(0, negatives.length() - 1));
		}

		return sum;
	}
}
