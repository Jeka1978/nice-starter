package com.nice.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Evegeny on 12/07/2017.
 */
@Configuration
@EnableConfigurationProperties(ProdMailsProps.class)
public class Config {
    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "niceProdNotificationListener")
    @ConditionalOnProperty(name = "nice.notification.enabled",
            matchIfMissing = true,
            havingValue = "true")
    public ProdNotificationListener listener(){
        return new ProdNotificationListener();
    }


}










