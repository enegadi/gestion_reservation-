package enegadi.ismail.gestion_reservation.DTO;

import enegadi.ismail.gestion_reservation.entities.Reservation;
import enegadi.ismail.gestion_reservation.enums.EquipmentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
public class EquipmentDTO {
    private Long id;
    private String name;
    private double weight;
    private EquipmentType type;
    private String catalog;
}