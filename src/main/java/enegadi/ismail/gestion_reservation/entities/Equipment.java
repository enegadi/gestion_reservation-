package enegadi.ismail.gestion_reservation.entities;

import enegadi.ismail.gestion_reservation.enums.EquipmentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Equipment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double weight;
    private EquipmentType type;
    private String catalog; // Path to PDF file or stored as BLOB

    @ManyToMany(mappedBy = "equipments")
    private Set<Reservation> reservations;
}