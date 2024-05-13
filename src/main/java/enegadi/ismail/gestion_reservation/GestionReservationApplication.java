package enegadi.ismail.gestion_reservation;

import enegadi.ismail.gestion_reservation.entities.ConferenceRoom;
import enegadi.ismail.gestion_reservation.entities.Employee;
import enegadi.ismail.gestion_reservation.entities.Equipment;
import enegadi.ismail.gestion_reservation.entities.Reservation;
import enegadi.ismail.gestion_reservation.enums.EquipmentType;
import enegadi.ismail.gestion_reservation.enums.ReservationStatus;
import enegadi.ismail.gestion_reservation.repositories.ConferenceRoomRepository;
import enegadi.ismail.gestion_reservation.repositories.EmployeeRepository;
import enegadi.ismail.gestion_reservation.repositories.EquipmentRepository;
import enegadi.ismail.gestion_reservation.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionReservationApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ConferenceRoomRepository conferenceRoomRepository, EmployeeRepository employeeRepository, EquipmentRepository equipmentRepository, ReservationRepository reservationRepository) {
        return args -> {

            Random rand = new Random();


            Stream.of("Reservation 1", "Reservation 2", "Reservation 3").forEach(
                    res -> {
                        Reservation reservation = new Reservation();
                        reservation.setDescription(res);
                        reservation.setStatus(ReservationStatus.VALIDATED);
                        reservation.setDuration(2);
                        reservation.setDate(new Date());
                        Reservation savedReservation = reservationRepository.save(reservation);

                    }
            );

            List<Reservation> reservations = reservationRepository.findAll();
            Stream.of("Employee 1", "Employee 2", "Employee 3").forEach(
                    emp -> {
                        Employee employee = new Employee();
                        employee.setName(emp);
                        employee.setEmail(emp.toLowerCase().replace(" ", ".") + "@gmail.com");
                        employee.setPhoto("https://picsum.photos/id/237/200/300");
                        employee.setReservations(reservations);
                        Employee savedEmployee = employeeRepository.save(employee);
                    }
            );

            Stream.of("Equipment 1", "Equipment 2", "Equipment 3").forEach(
                    eq -> {
                        Equipment equipment = new Equipment();
                        equipment.setName(eq);
                        equipment.setWeight(2.5);
                        equipment.setType(EquipmentType.TABLEAU_INTERACTIF);
                        Equipment savedEquipment = equipmentRepository.save(equipment);
                    }
            );


            Stream.of("Conference Room 1", "Conference Room 2", "Conference Room 3").forEach(
                    cr -> {
                        ConferenceRoom conferenceRoom = new ConferenceRoom();
                        conferenceRoom.setName(cr);
                        conferenceRoom.setNumber("CR-" + cr);
                        conferenceRoom.setCapacity(10);
                        ConferenceRoom savedConferenceRoom = conferenceRoomRepository.save(conferenceRoom);
                    });
        };
    }
}