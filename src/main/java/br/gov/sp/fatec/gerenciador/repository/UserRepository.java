package br.gov.sp.fatec.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.gerenciador.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
