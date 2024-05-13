package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.EquipmentDTO;
import enegadi.ismail.gestion_reservation.entities.Equipment;
import enegadi.ismail.gestion_reservation.mappers.ReservationMapperImpl;
import enegadi.ismail.gestion_reservation.repositories.EquipmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class EquipmentServiceImpl implements EquipmentService{
    private EquipmentRepository equipmentRepository;
    private ReservationMapperImpl dtoMapper;
    @Override
    public void addEquipment(EquipmentDTO equipmentDTO) {
        Equipment equipment = dtoMapper.fromDTOToEntityEquipment(equipmentDTO);
        Equipment savedEquipment = equipmentRepository.save(equipment);
    }

    @Override
    public void updateEquipment(EquipmentDTO equipmentDTO) {
            Equipment equipment = dtoMapper.fromDTOToEntityEquipment(equipmentDTO);
            Equipment savedEquipment = equipmentRepository.save(equipment);
    }

    @Override
    public void deleteEquipment(Long id) {
        equipmentRepository.deleteById(id);
    }

    @Override
    public List<EquipmentDTO> getAllEquipments() {
        List<Equipment> equipments = equipmentRepository.findAll();
        List<EquipmentDTO> equipmentDTOS = equipments.stream().map(equipment -> dtoMapper.fromEntityToDTOEquipment(equipment)).collect(Collectors.toList());
        return equipmentDTOS;
    }

    @Override
    public EquipmentDTO getEquipmentById(Long id) {
        Equipment equipment = equipmentRepository.findById(id).orElse(null);
        EquipmentDTO equipmentDTO = dtoMapper.fromEntityToDTOEquipment(equipment);
        return equipmentDTO;
    }
}
