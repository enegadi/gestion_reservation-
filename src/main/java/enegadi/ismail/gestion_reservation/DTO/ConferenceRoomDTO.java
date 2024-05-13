package enegadi.ismail.gestion_reservation.DTO;

import enegadi.ismail.gestion_reservation.enums.ConferenceRoomType;
import lombok.Data;

@Data
public class ConferenceRoomDTO {
    private Long id;
    private String number;
    private String name;
    private int capacity;
    private ConferenceRoomType type;
}
