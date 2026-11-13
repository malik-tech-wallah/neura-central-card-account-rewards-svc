package com.neura.central.cardaccountrewards.controller;

import com.neura.central.cardaccountrewards.dto.HealthResponse;
import com.neura.central.cardaccountrewards.service.HealthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public HealthResponse getHealth() {
        log.info("Get Health check requested");
        return healthService.getHealth();
    }
}
