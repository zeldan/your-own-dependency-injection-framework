package com.di.example.service.impl;

import com.di.example.service.GreetingService;

public class WelcomeServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Welcome";
    }
}