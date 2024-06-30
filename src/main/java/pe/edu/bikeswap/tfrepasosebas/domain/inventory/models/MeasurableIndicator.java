package pe.edu.bikeswap.tfrepasosebas.domain.inventory.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pe.edu.bikeswap.tfrepasosebas.domain.enums.EquipmentType;

@Entity
@Table(name = "measurable_indicators", uniqueConstraints = @UniqueConstraint(columnNames = {"symbol", "equipment_type"}))
@Data
@Getter
@Setter
public class MeasurableIndicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symbol;

    private String description;

    @Column(name = "threshold_minimum", nullable = false)
    private Double thresholdMinimum;

    @Column(name = "threshold_maximum", nullable = false)
    private Double thresholdMaximum;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment_type", nullable = false)
    private EquipmentType equipmentType;
}
