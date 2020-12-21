package com.boot.service.logging.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service.logging")
public class LoggingProperties {
    private String loggerName = "ServiceAuditLogger";

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }
}
