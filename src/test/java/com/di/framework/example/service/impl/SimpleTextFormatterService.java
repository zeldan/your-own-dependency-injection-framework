package com.di.framework.example.service.impl;

import com.di.framework.example.service.TextFormatterService;

public class SimpleTextFormatterService implements TextFormatterService {

	@Override
	public String format(String text) {
		return "Simple text: " + text;
	}

}
