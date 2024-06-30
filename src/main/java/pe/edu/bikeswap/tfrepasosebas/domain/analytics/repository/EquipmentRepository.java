package pe.edu.bikeswap.tfrepasosebas.domain.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.bikeswap.tfrepasosebas.domain.analytics.models.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long>{

}
