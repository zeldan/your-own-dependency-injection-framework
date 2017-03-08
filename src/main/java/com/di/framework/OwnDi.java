package com.di.framework;

import com.di.framework.module.IModule;

/**
 * It initializes the configuration (based on the configuration module).
 *
 * @author zeldan
 *
 */
public class OwnDi {

    public static OwnDiFramework getContainer(final IModule module) {
        module.configure();
        return new OwnDiFramework(module);
    }
}