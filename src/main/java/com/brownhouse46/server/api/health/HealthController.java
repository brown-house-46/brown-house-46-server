package com.brownhouse46.server.api.health;

import com.brownhouse46.server.application.health.GetHealthUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthController {

    private final GetHealthUseCase getHealthUseCase;

    @GetMapping("/health")
    public String health() {
        return getHealthUseCase.execute().value();
    }
}
