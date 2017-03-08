package com.di.app.service.impl;

import com.di.app.service.GreetingService;

public class WelcomeServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Welcome";
    }
}