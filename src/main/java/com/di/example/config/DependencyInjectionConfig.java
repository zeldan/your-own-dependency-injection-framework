package com.di.example.config;

import com.di.example.service.GreetingService;
import com.di.example.service.Logger;
import com.di.example.service.impl.QuietLoggerImpl;
import com.di.example.service.impl.WelcomeServiceImpl;
import com.di.framework.module.impl.AbstractModule;

public class DependencyInjectionConfig extends AbstractModule {

    @Override
    public void configure() {
        createMapping(GreetingService.class, WelcomeServiceImpl.class);
        createMapping(Logger.class, QuietLoggerImpl.class);
    }
}