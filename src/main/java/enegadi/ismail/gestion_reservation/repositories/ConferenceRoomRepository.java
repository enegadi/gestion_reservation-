package enegadi.ismail.gestion_reservation.repositories;

import enegadi.ismail.gestion_reservation.entities.ConferenceRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRoomRepository extends JpaRepository<ConferenceRoom, Long> {
}
