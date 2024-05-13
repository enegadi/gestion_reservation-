package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.ReservationDTO;
import enegadi.ismail.gestion_reservation.entities.Reservation;
import enegadi.ismail.gestion_reservation.mappers.ReservationMapperImpl;
import enegadi.ismail.gestion_reservation.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class ReservationServiceImpl implements ReservationService{
    private ReservationRepository reservationRepository;
    private ReservationMapperImpl dtoMapper;
    @Override
    public void addReservation(ReservationDTO reservationDTO) {
        Reservation reservation = dtoMapper.fromDTOToEntityReservation(reservationDTO);
        Reservation savedReservation = reservationRepository.save(reservation);
    }

    @Override
    public void updateReservation(ReservationDTO reservationDTO) {
        Reservation reservation = dtoMapper.fromDTOToEntityReservation(reservationDTO);
        Reservation savedReservation = reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        List<ReservationDTO> reservationDTOS = reservations.stream().map(reservation -> dtoMapper.fromEntityToDTOReservation(reservation)).collect(java.util.stream.Collectors.toList());
        return reservationDTOS;
    }

    @Override
    public ReservationDTO getReservationById(Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        ReservationDTO reservationDTO = dtoMapper.fromEntityToDTOReservation(reservation);
        return reservationDTO;
    }
}
