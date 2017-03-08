package com.di.app.service.impl;

import com.di.app.service.Logger;

public class QuietLoggerImpl implements Logger {

    @Override
    public void log(final String param) {
        System.out.println("The value: " + param);
    }
}