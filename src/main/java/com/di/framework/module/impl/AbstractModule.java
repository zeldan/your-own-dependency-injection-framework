package com.di.framework.module.impl;

import java.util.HashMap;
import java.util.Map;

import com.di.framework.module.IModule;

/**
 * Abstract module to configure and retrieve proper dependency injection mapping.
 *
 * @author zeldan
 *
 */
public abstract class AbstractModule implements IModule {

    private final Map<Class<?>, Class<?>> classMap = new HashMap<>();

    protected <T> void createMapping(final Class<T> baseClass, final Class<? extends T> subClass) {
        classMap.put(baseClass, subClass.asSubclass(baseClass));
    }

    @Override
    public <T> Class<? extends T> getMapping(final Class<T> type) {
        final Class<?> implementation = classMap.get(type);
        if (implementation == null) {
            throw new IllegalArgumentException("Couldn't find the mapping (subclass / implementation) for : " + type);
        }
        return implementation.asSubclass(type);
    }
}
