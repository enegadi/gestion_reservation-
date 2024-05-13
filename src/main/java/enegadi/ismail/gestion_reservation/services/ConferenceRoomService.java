package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.ConferenceRoomDTO;

import java.util.List;

public interface ConferenceRoomService {
    void addConferenceRoom(ConferenceRoomDTO conferenceRoomDTO);
    void updateConferenceRoom(ConferenceRoomDTO conferenceRoomDTO);
    void deleteConferenceRoom(Long id);
    List<ConferenceRoomDTO> getAllConferenceRooms();
    ConferenceRoomDTO getConferenceRoomById(Long id);

}
