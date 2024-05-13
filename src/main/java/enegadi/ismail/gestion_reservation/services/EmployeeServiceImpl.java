package enegadi.ismail.gestion_reservation.services;

import enegadi.ismail.gestion_reservation.DTO.EmployeeDTO;
import enegadi.ismail.gestion_reservation.entities.Employee;
import enegadi.ismail.gestion_reservation.mappers.ReservationMapperImpl;
import enegadi.ismail.gestion_reservation.repositories.EmployeeRepository;
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
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    private ReservationMapperImpl dtoMapper;
    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = dtoMapper.fromDTOToEntityEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = dtoMapper.fromDTOToEntityEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOS = employees.stream().map(employee -> dtoMapper.fromEntityToDTOEmployee(employee)).collect(Collectors.toList());
        return employeeDTOS;
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        EmployeeDTO employeeDTO = dtoMapper.fromEntityToDTOEmployee(employee);
        return employeeDTO;
    }
}
