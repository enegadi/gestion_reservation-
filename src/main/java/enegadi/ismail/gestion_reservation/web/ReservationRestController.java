package enegadi.ismail.gestion_reservation.web;

import enegadi.ismail.gestion_reservation.DTO.EquipmentDTO;
import enegadi.ismail.gestion_reservation.DTO.ReservationDTO;
import enegadi.ismail.gestion_reservation.services.EquipmentService;
import enegadi.ismail.gestion_reservation.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public List<ReservationDTO> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/reservation/{id}")
    public ReservationDTO getReservationById(Long id) {
        return reservationService.getReservationById(id);
    }

    @DeleteMapping("/reservation/{id}")
    public void deleteReservation(Long id) {
        reservationService.deleteReservation(id);
    }

    @PostMapping("/reservation")
    public void addReservation(ReservationDTO reservationDTO) {
        reservationService.addReservation(reservationDTO);
    }

    @PutMapping("/reservation")
    public void updateReservation(ReservationDTO reservationDTO) {
        reservationService.updateReservation(reservationDTO);
    }

}
