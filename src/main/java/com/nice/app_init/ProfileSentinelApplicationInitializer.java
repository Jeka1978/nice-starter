package com.nice.app_init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by Evegeny on 12/07/2017.
 */
public class ProfileSentinelApplicationInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getEnvironment().getActiveProfiles().length == 0) {
            throw new IllegalStateException("לא עובדים ללא פרופיל");
        }
    }
}
