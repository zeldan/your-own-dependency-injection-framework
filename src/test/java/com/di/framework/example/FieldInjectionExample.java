package com.di.framework.example;

import com.di.framework.annotation.OwnInject;
import com.di.framework.example.service.CalculatorService;
import com.di.framework.example.service.TextFormatterService;

public class FieldInjectionExample {

	@OwnInject
	private CalculatorService calculatorService;

	@OwnInject
	private TextFormatterService textFormatterService;

	public String processNumbers(int firstNumber, int secondNumber) {
		int number = calculatorService.calculate(firstNumber, secondNumber);
		return textFormatterService.format(String.valueOf(number));
	}
}