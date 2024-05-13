package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.ConferenceRoomDTO;
import enegadi.ismail.gestion_reservation.entities.ConferenceRoom;
import enegadi.ismail.gestion_reservation.mappers.ReservationMapperImpl;
import enegadi.ismail.gestion_reservation.repositories.ConferenceRoomRepository;
import enegadi.ismail.gestion_reservation.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class ConferenceRoomServiceImpl implements ConferenceRoomService{
    private ConferenceRoomRepository conferenceRoomRepository;
    private ReservationMapperImpl dtoMapper;
    @Override
    public void addConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        ConferenceRoom conferenceRoom = dtoMapper.fromDTOToEntityConferenceRoom(conferenceRoomDTO);
        ConferenceRoom savedConferenceRoom = conferenceRoomRepository.save(conferenceRoom);
    }

    @Override
    public void updateConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        ConferenceRoom conferenceRoom = dtoMapper.fromDTOToEntityConferenceRoom(conferenceRoomDTO);
        ConferenceRoom savedConferenceRoom = conferenceRoomRepository.save(conferenceRoom);
    }

    @Override
    public void deleteConferenceRoom(Long id) {
        conferenceRoomRepository.deleteById(id);
    }

    @Override
    public List<ConferenceRoomDTO> getAllConferenceRooms() {
        List<ConferenceRoom> conferenceRooms = conferenceRoomRepository.findAll();
        List<ConferenceRoomDTO> conferenceRoomDTOS = conferenceRooms.stream().map(conferenceRoom -> dtoMapper.fromEntityToDTOConferenceRoom(conferenceRoom)).collect(java.util.stream.Collectors.toList());
        return conferenceRoomDTOS;
    }

    @Override
    public ConferenceRoomDTO getConferenceRoomById(Long id) {
        ConferenceRoom conferenceRoom = conferenceRoomRepository.findById(id).orElse(null);
        ConferenceRoomDTO conferenceRoomDTO = dtoMapper.fromEntityToDTOConferenceRoom(conferenceRoom);
        return conferenceRoomDTO;
    }
}
