package br.gov.sp.fatec.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.gerenciador.entity.Authorization;

public interface AuthorizationRepository extends JpaRepository<Authorization, Long> {

}
