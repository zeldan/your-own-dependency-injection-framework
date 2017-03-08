package com.di.app.config;

import com.di.app.service.GreetingService;
import com.di.app.service.Logger;
import com.di.app.service.impl.QuietLoggerImpl;
import com.di.app.service.impl.WelcomeServiceImpl;
import com.di.framework.module.impl.AbstractModule;

public class DependencyInjectionConfig extends AbstractModule {

    @Override
    public void configure() {
        createMapping(GreetingService.class, WelcomeServiceImpl.class);
        createMapping(Logger.class, QuietLoggerImpl.class);
    }
}