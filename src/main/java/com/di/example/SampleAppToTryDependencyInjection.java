package com.di.example;

import com.di.example.client.Client;
import com.di.example.config.DependencyInjectionConfig;
import com.di.framework.OwnDi;
import com.di.framework.OwnDiFramework;

public class SampleAppToTryDependencyInjection {

    public static void main(final String[] args) throws Exception {
        final Client client = configDiFramework();
        client.greetingDevelopers();
    }

    private static Client configDiFramework() throws Exception {
        final OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfig());
        return (Client) ownDi.inject(Client.class);
    }
}