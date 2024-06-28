package com.example.backend.controller;

import com.example.backend.model.MetricType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/metrics")

public class MetricController {

    @GetMapping
    public ResponseEntity<List<MetricType>> getMetrics() {
        try {
            List<MetricType> metrics = Arrays.asList(
                    new MetricType(
                            1,
                            Arrays.asList(4, 2, 4, 7, 9, 10, 8, 6),
                            "Khabib",
                            "Product price",
                            "My metrics",
                            "20.10.2023"
                    ),
                    new MetricType(
                            2,
                            Arrays.asList(1, 2, 7, 7, 7, 6, 8, 10),
                            "Buldiga",
                            "Company shares",
                            "My metrics",
                            "10.10.2023"
                    ),
                    new MetricType(
                            3,
                            Arrays.asList(1, 2, 4, 5, 4, 6, 8, 10),
                            "Chell",
                            "Personal amount",
                            "My metrics",
                            "25.10.2023"
                    )
            );

            if (metrics.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            return ResponseEntity.ok(metrics);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }
}