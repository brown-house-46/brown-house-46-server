package com.brownhouse46.server.domain.health;

public class HealthStatus {

    private final String value;

    public HealthStatus(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
