package br.gov.sp.fatec.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.gerenciador.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
