package br.gov.sp.fatec.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.gerenciador.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
