package pe.edu.bikeswap.tfrepasosebas.domain.analytics.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.bikeswap.tfrepasosebas.domain.analytics.models.Equipment;
import pe.edu.bikeswap.tfrepasosebas.domain.analytics.repository.EquipmentRepository;

@Service
@RequiredArgsConstructor
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    @Transactional
    public Equipment saveEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
