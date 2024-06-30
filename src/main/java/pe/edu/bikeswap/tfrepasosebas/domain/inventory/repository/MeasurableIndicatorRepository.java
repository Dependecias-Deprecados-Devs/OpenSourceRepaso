package pe.edu.bikeswap.tfrepasosebas.domain.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.bikeswap.tfrepasosebas.domain.enums.EquipmentType;
import pe.edu.bikeswap.tfrepasosebas.domain.inventory.models.MeasurableIndicator;

public interface MeasurableIndicatorRepository extends JpaRepository<MeasurableIndicator, Long> {
    boolean existsBySymbolAndEquipmentType(String symbol, EquipmentType equipmentType);
}
