package com.di.example.client;

import com.di.example.service.GreetingService;
import com.di.example.service.Logger;
import com.di.framework.annotation.OwnInject;

public class Client {

    private final GreetingService service;
    private final Logger logger;

    @OwnInject
    public Client(final GreetingService service, final Logger logger) {
        this.service = service;
        this.logger = logger;
    }

    public void greetingDevelopers() {
        final String greeting = service.greeting();
        logger.log(greeting);
    }
}