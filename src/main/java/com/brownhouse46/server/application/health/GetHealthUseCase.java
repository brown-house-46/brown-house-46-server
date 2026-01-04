package com.brownhouse46.server.application.health;

import com.brownhouse46.server.domain.health.HealthStatus;
import org.springframework.stereotype.Service;

@Service
public class GetHealthUseCase {

    public HealthStatus execute() {
        return new HealthStatus("ok");
    }
}
