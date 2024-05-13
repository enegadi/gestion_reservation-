package enegadi.ismail.gestion_reservation.web;

import enegadi.ismail.gestion_reservation.DTO.EmployeeDTO;
import enegadi.ismail.gestion_reservation.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeRestController {
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public EmployeeDTO getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(Long id) {
        employeeService.deleteEmployee(id);
    }

    @PostMapping("/employee")
    public void addEmployee(EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
    }

    @PutMapping("/employee")
    public void updateEmployee(EmployeeDTO employeeDTO) {
        employeeService.updateEmployee(employeeDTO);
    }
}
