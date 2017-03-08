package com.di.app.service.impl;

import com.di.app.service.GreetingService;

public class GoodbyServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Goodbye";
    }
}