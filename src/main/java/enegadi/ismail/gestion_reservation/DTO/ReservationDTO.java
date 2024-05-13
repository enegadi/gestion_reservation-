package enegadi.ismail.gestion_reservation.DTO;


import enegadi.ismail.gestion_reservation.enums.ReservationStatus;

import lombok.Data;

import java.util.Date;


@Data
public class ReservationDTO {
    private Long id;
    private Date date;
    private int duration;
    private String description;
    private ReservationStatus status;
}