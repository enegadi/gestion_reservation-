package enegadi.ismail.gestion_reservation.repositories;

import enegadi.ismail.gestion_reservation.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
