package com.di.example.client;

import com.di.example.service.GreetingService;
import com.di.example.service.Logger;
import com.di.framework.annotation.OwnInject;

public class FieldInjectionClient {

    @OwnInject
    private GreetingService service;

    @OwnInject
    private Logger logger;

    public void greetingDevelopers() {
        final String greeting = service.greeting();
        logger.log(greeting);
    }
}
