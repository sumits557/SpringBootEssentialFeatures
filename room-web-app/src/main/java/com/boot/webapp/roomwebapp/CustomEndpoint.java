package com.boot.webapp.roomwebapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomEndpoint implements Endpoint {


    @Value("${service.logging.logger-name}")
    private String loggingName;

    @Override
    public String id() {
        return "CustomEndpoint";
    }

    @Override
    public boolean enableByDefault() {
        return true;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        Map<String, String> results = new HashMap<>();
        results.put("Logger Name", loggingName);
        results.put("Author Name", "Sumit S");
        return null;
    }
}
