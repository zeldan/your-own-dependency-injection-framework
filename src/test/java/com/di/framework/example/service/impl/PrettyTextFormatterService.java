package com.di.framework.example.service.impl;

import com.di.framework.example.service.TextFormatterService;

public class PrettyTextFormatterService implements TextFormatterService {

	@Override
	public String format(String text) {
		return "Pretty text: <" + text + ">";
	}

}
