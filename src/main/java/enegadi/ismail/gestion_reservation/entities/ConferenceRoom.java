package enegadi.ismail.gestion_reservation.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import enegadi.ismail.gestion_reservation.enums.ConferenceRoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class ConferenceRoom {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String name;
    private int capacity;
    private ConferenceRoomType type;

    @OneToMany(mappedBy = "conferenceRoom", orphanRemoval = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Reservation> reservations;
}
