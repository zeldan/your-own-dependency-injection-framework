package com.di.example.service.impl;

import com.di.example.service.Logger;

public class QuietLoggerImpl implements Logger {

    @Override
    public void log(final String param) {
        System.out.println("The value: " + param);
    }
}