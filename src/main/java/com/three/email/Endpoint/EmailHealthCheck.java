package com.three.email.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

public class EmailHealthCheck extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        boolean running = true;
        if (running) {
            builder.up().withDetail("The service is running well", "true");
        } else {
            builder.down().withDetail("The service is running well", "false");;
        }

    }
}
