package com.di.framework;

import static org.junit.Assert.assertEquals;

import com.di.framework.example.ConstructorInjectionExample;
import org.junit.Test;

import com.di.framework.example.FieldInjectionExample;
import com.di.framework.example.service.CalculatorService;
import com.di.framework.example.service.TextFormatterService;
import com.di.framework.example.service.impl.AdditionCalculatorService;
import com.di.framework.example.service.impl.PrettyTextFormatterService;
import com.di.framework.example.service.impl.SimpleTextFormatterService;
import com.di.framework.example.service.impl.SubtractionCalculatorService;
import com.di.framework.module.impl.AbstractModule;

public class OwnDiFrameworkTest {

	@Test
	public void shouldInjectPrettyTextFormatterAndAdditionCalculatorViaFieldInjection() throws Exception {
		OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfigExample1());
		FieldInjectionExample example = (FieldInjectionExample) ownDi.inject(FieldInjectionExample.class);

		String processNumbers = example.processNumbers(3, 2);

		assertEquals("Pretty text: <5>", processNumbers);
	}

	@Test
	public void shouldInjectSimpleTextFormatterAndAdditionCalculatorViaFieldInjection() throws Exception {
		OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfigExample2());
		FieldInjectionExample example = (FieldInjectionExample) ownDi.inject(FieldInjectionExample.class);
		
		String processNumbers = example.processNumbers(3, 2);
		
		assertEquals("Simple text: 5", processNumbers);
	}

	@Test
	public void shouldInjectSimpleTextFormatterAndSubtractionCalculatorViaConstructorInjection() throws Exception {
		OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfigExample3());
		ConstructorInjectionExample example = (ConstructorInjectionExample) ownDi.inject(ConstructorInjectionExample.class);
		
		String processNumbers = example.processNumbers(3, 2);
		
		assertEquals("Simple text: 1", processNumbers);
	}

	private class DependencyInjectionConfigExample1 extends AbstractModule {

		@Override
		public void configure() {
			createMapping(CalculatorService.class, AdditionCalculatorService.class);
			createMapping(TextFormatterService.class, PrettyTextFormatterService.class);
		}
	}

	private class DependencyInjectionConfigExample2 extends AbstractModule {
		
		@Override
		public void configure() {
			createMapping(CalculatorService.class, AdditionCalculatorService.class);
			createMapping(TextFormatterService.class, SimpleTextFormatterService.class);
		}
	}

	private class DependencyInjectionConfigExample3 extends AbstractModule {
		
		@Override
		public void configure() {
			createMapping(CalculatorService.class, SubtractionCalculatorService.class);
			createMapping(TextFormatterService.class, SimpleTextFormatterService.class);
		}
	}

}
