package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.ReservationDTO;

import java.util.List;

public interface ReservationService {
    void addReservation(ReservationDTO reservationDTO);
    void updateReservation(ReservationDTO reservationDTO);
    void deleteReservation(Long id);
    List<ReservationDTO> getAllReservations();
    ReservationDTO getReservationById(Long id);
}
