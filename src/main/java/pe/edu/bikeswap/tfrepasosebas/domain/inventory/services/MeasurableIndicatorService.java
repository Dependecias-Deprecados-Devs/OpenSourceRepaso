package pe.edu.bikeswap.tfrepasosebas.domain.inventory.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.bikeswap.tfrepasosebas.domain.inventory.models.MeasurableIndicator;
import pe.edu.bikeswap.tfrepasosebas.domain.inventory.repository.MeasurableIndicatorRepository;

@Service
@RequiredArgsConstructor
public class MeasurableIndicatorService {
    private final MeasurableIndicatorRepository measurableIndicatorRepository;

    @Transactional
    public MeasurableIndicator saveMeasurableIndicator(MeasurableIndicator indicator) {
        if (indicator.getThresholdMaximum() < indicator.getThresholdMinimum()) {
            throw new IllegalArgumentException("thresholdMaximum must be greater than or equal to thresholdMinimum");
        }

        if (measurableIndicatorRepository.existsBySymbolAndEquipmentType(indicator.getSymbol(), indicator.getEquipmentType())) {
            throw new IllegalArgumentException("MeasurableIndicator with the same symbol and equipment type already exists");
        }

        return measurableIndicatorRepository.save(indicator);
    }
}
