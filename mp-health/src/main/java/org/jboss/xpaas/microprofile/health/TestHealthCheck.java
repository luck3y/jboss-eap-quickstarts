package org.jboss.xpaas.microprofile.health;

import java.util.logging.Logger;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@Health
public class TestHealthCheck implements HealthCheck {

    private static final Logger LOGGER = Logger
            .getLogger(TestHealthCheck.class.getName());

    @Override
    public HealthCheckResponse call() {
        String desiredState = System.getenv("DESIRED_STATE");
        LOGGER.info("Health Check called");
        switch (desiredState) {
            case "OK":
                return HealthCheckResponse.named("Test Health Check").withData("test", "data").up().build();

            case "FAIL":
                return HealthCheckResponse.named("Test Health Check").down().build();

            case "UNDETERMINED":
                throw new RuntimeException("Health Check Failure");

            default:
                return null;
        }
    }
}
