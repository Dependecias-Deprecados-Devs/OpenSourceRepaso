package pe.edu.bikeswap.tfrepasosebas.domain.analytics.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pe.edu.bikeswap.tfrepasosebas.domain.enums.EquipmentType;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "equipments")
@Data
@Getter
@Setter
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "material_serial_number", unique = true, nullable = false)
    private UUID materialSerialNumber = UUID.randomUUID();

    @Column(nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment_type", nullable = false)
    private EquipmentType equipmentType;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
