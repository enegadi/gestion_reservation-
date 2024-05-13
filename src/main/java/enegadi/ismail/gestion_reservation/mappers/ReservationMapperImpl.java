package enegadi.ismail.gestion_reservation.mappers;

import enegadi.ismail.gestion_reservation.DTO.ConferenceRoomDTO;
import enegadi.ismail.gestion_reservation.DTO.EmployeeDTO;
import enegadi.ismail.gestion_reservation.DTO.EquipmentDTO;
import enegadi.ismail.gestion_reservation.DTO.ReservationDTO;
import enegadi.ismail.gestion_reservation.entities.ConferenceRoom;
import enegadi.ismail.gestion_reservation.entities.Employee;
import enegadi.ismail.gestion_reservation.entities.Equipment;
import enegadi.ismail.gestion_reservation.entities.Reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ReservationMapperImpl {
    public EmployeeDTO fromEntityToDTOEmployee(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee, employeeDTO);
        return employeeDTO;
    }

    public Employee fromDTOToEntityEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        return employee;
    }

    public EquipmentDTO fromEntityToDTOEquipment(Equipment equipment) {
        EquipmentDTO equipmentDTO = new EquipmentDTO();
        BeanUtils.copyProperties(equipment, equipmentDTO);
        return equipmentDTO;
    }

    public Equipment fromDTOToEntityEquipment(EquipmentDTO equipmentDTO) {
        Equipment equipment = new Equipment();
        BeanUtils.copyProperties(equipmentDTO, equipment);
        return equipment;
    }


    public ReservationDTO fromEntityToDTOReservation(Reservation reservation) {
        ReservationDTO reservationDTO = new ReservationDTO();
        BeanUtils.copyProperties(reservation, reservationDTO);
        return reservationDTO;
    }

    public Reservation fromDTOToEntityReservation(ReservationDTO reservationDTO) {
        Reservation reservation = new Reservation();
        BeanUtils.copyProperties(reservationDTO, reservation);
        return reservation;
    }


    public ConferenceRoomDTO fromEntityToDTOConferenceRoom(ConferenceRoom conferenceRoom) {
        ConferenceRoomDTO conferenceRoomDTO = new ConferenceRoomDTO();
        BeanUtils.copyProperties(conferenceRoom, conferenceRoomDTO);
        return conferenceRoomDTO;
    }

    public ConferenceRoom fromDTOToEntityConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        ConferenceRoom conferenceRoom = new ConferenceRoom();
        BeanUtils.copyProperties(conferenceRoomDTO, conferenceRoom);
        return conferenceRoom;
    }
}
