package pe.edu.bikeswap.tfrepasosebas.domain.inventory.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.bikeswap.tfrepasosebas.domain.inventory.models.MeasurableIndicator;
import pe.edu.bikeswap.tfrepasosebas.domain.inventory.services.MeasurableIndicatorService;

@RestController
@RequestMapping("/api/v1/measurable-indicators")
@RequiredArgsConstructor
public class MeasurableIndicatorController {

    private final MeasurableIndicatorService measurableIndicatorService;

    @PostMapping
    public ResponseEntity<MeasurableIndicator> createMeasurableIndicator(@RequestBody MeasurableIndicator indicator) {
        MeasurableIndicator savedIndicator = measurableIndicatorService.saveMeasurableIndicator(indicator);
        return ResponseEntity.status(201).body(savedIndicator);
    }
}
