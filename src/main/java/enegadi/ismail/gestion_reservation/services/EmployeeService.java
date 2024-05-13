package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.EmployeeDTO;

import java.util.List;
public interface EmployeeService {
    void addEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(Long id);
}
