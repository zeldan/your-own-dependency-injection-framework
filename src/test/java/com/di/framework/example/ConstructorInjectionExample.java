package com.di.framework.example;

import com.di.framework.annotation.OwnInject;
import com.di.framework.example.service.CalculatorService;
import com.di.framework.example.service.TextFormatterService;

public class ConstructorInjectionExample {

	private final CalculatorService calculatorService;
	private final TextFormatterService textFormatterService;

	@OwnInject
	public ConstructorInjectionExample(CalculatorService calculatorService, TextFormatterService textFormatterService) {
		this.calculatorService = calculatorService;
		this.textFormatterService = textFormatterService;
	}

	public String processNumbers(int firstNumber, int secondNumber) {
		int number = calculatorService.calculate(firstNumber, secondNumber);
		return textFormatterService.format(String.valueOf(number));
	}
}