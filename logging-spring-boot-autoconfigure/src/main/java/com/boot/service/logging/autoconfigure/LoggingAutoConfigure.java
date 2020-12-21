package com.boot.service.logging.autoconfigure;


import com.boot.service.logging.servicelogging.LoggableAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LoggableAspect.class)
@EnableConfigurationProperties(LoggingProperties.class)
public class LoggingAutoConfigure {

    @Autowired
    private LoggingProperties properties;

    @Bean
    public LoggableAspect loggableAspect() {
        return new LoggableAspect(properties.getLoggerName());
    }

}
