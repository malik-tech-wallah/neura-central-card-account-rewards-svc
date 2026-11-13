package com.neura.central.cardaccountrewards.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.neura.central.cardaccountrewards.dto.HealthResponse;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import org.junit.jupiter.api.Test;

class HealthServiceTest {

    @Test
    void returnsUpStatusAndCurrentTime() {
        Instant now = Instant.parse("2025-01-01T00:00:00Z");
        HealthService service = new HealthService(Clock.fixed(now, ZoneOffset.UTC));

        HealthResponse response = service.getHealth();

        assertThat(response.status()).isEqualTo("UP");
        assertThat(response.timestamp()).isEqualTo(now);
    }
}
