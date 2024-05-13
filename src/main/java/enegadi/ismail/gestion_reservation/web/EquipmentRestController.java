package enegadi.ismail.gestion_reservation.web;

import enegadi.ismail.gestion_reservation.DTO.EmployeeDTO;
import enegadi.ismail.gestion_reservation.DTO.EquipmentDTO;
import enegadi.ismail.gestion_reservation.services.EmployeeService;
import enegadi.ismail.gestion_reservation.services.EquipmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EquipmentRestController {
    private EquipmentService equipmentService;

    @GetMapping("/equipments")
    public List<EquipmentDTO> getAllEquipments() {
        return equipmentService.getAllEquipments();
    }

    @GetMapping("/equipment/{id}")
    public EquipmentDTO getEquipmentById(Long id) {
        return equipmentService.getEquipmentById(id);
    }

    @DeleteMapping("/equipment/{id}")
    public void deleteEquipment(Long id) {
        equipmentService.deleteEquipment(id);
    }

    @PostMapping("/equipment")
    public void addEquipment(EquipmentDTO equipmentDTO) {
        equipmentService.addEquipment(equipmentDTO);
    }

    @PutMapping("/equipment")
    public void updateEquipment(EquipmentDTO equipmentDTO) {
        equipmentService.updateEquipment(equipmentDTO);
    }
}
