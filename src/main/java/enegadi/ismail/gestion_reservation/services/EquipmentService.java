package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.EquipmentDTO;

import java.util.List;

public interface EquipmentService {
    void addEquipment(EquipmentDTO equipmentDTO);
    void updateEquipment(EquipmentDTO equipmentDTO);
    void deleteEquipment(Long id);
    List<EquipmentDTO> getAllEquipments();
    EquipmentDTO getEquipmentById(Long id);
}
