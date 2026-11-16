package com.neura.central.cardaccountrewards.service;

import com.neura.central.cardaccountrewards.dto.HealthResponse;
import java.time.Clock;
import java.time.Instant;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final Clock clock;

    public HealthService(Clock clock) {
        this.clock = clock;
    }

    public HealthResponse getHealth() {
        return new HealthResponse("UP", Instant.now(clock));
    }
}
