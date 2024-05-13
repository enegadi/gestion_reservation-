package enegadi.ismail.gestion_reservation.repositories;

import enegadi.ismail.gestion_reservation.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
