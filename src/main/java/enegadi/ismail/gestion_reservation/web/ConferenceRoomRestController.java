package enegadi.ismail.gestion_reservation.web;


import enegadi.ismail.gestion_reservation.DTO.ConferenceRoomDTO;
import enegadi.ismail.gestion_reservation.services.ConferenceRoomService;
import enegadi.ismail.gestion_reservation.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ConferenceRoomRestController {
    private ConferenceRoomService conferenceRoomService;


    @GetMapping("/conferenceRooms")
    public List<ConferenceRoomDTO> getAllConferenceRooms() {
        return conferenceRoomService.getAllConferenceRooms();
    }

    @GetMapping("/conferenceRoom/{id}")
    public ConferenceRoomDTO getConferenceRoomById(Long id) {
        return conferenceRoomService.getConferenceRoomById(id);
    }

    @DeleteMapping("/conferenceRoom/{id}")
    public void deleteConferenceRoom(Long id) {
        conferenceRoomService.deleteConferenceRoom(id);
    }

    @PostMapping("/conferenceRoom")
    public void addConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        conferenceRoomService.addConferenceRoom(conferenceRoomDTO);
    }

    @PutMapping("/conferenceRoom")
    public void updateConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        conferenceRoomService.updateConferenceRoom(conferenceRoomDTO);
    }
}
