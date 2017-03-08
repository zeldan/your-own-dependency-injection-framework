package com.di.app;

import com.di.app.client.Client;
import com.di.app.config.DependencyInjectionConfig;
import com.di.framework.OwnDi;
import com.di.framework.OwnDiFramework;

public class SampleAppToTryDependencyInjection {

    public static void main(final String[] args) throws Exception {
        final Client client = configDiFramework();
        client.greetingDevelopers();
    }

    private static Client configDiFramework() throws Exception {
        final OwnDiFramework ownDi = OwnDi.getContainer(new DependencyInjectionConfig());
        return (Client) ownDi.inject(Client.class);
    }
}