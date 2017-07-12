package com.nice.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Evegeny on 12/07/2017.
 */

public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ProdMailsProps prodMailsProps;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("PROD env was successfully started");
        prodMailsProps.getMails().forEach(System.out::println);
    }
}
