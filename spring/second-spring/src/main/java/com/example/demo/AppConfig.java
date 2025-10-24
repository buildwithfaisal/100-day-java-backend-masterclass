package com.example.demo;

import com.example.loose.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public LifecycleBean lifecycleBean(NotificationService notificationService) {
        return new LifecycleBean(notificationService);
    }
}
