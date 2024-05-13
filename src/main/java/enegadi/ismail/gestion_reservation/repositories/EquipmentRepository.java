package enegadi.ismail.gestion_reservation.repositories;

import enegadi.ismail.gestion_reservation.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
