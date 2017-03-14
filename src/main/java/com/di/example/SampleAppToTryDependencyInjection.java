package com.di.example;

import com.di.example.client.ConstructorInjectionClient;
import com.di.example.client.FieldInjectionClient;
import com.di.example.config.DependencyInjectionConfig;
import com.di.framework.OwnDi;
import com.di.framework.OwnDiFramework;

/**
 * An example app that shows how you can use constructor and field injection.
 *
 * @author zeldan
 */
public class SampleAppToTryDependencyInjection {

    public static void main(final String[] args) throws Exception {
        final OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfig());
        constructorInjection(ownDi);
        fieldInjection(ownDi);
    }

    private static void fieldInjection(OwnDiFramework ownDi) throws Exception {
        final FieldInjectionClient fieldInjectionClient = (FieldInjectionClient) ownDi.inject(FieldInjectionClient.class);
        fieldInjectionClient.greetingDevelopers();
    }

    private static void constructorInjection(OwnDiFramework ownDi) throws Exception {
        final ConstructorInjectionClient constructorInjectionClient = (ConstructorInjectionClient) ownDi.inject(ConstructorInjectionClient.class);
        constructorInjectionClient.greetingDevelopers();
    }
}