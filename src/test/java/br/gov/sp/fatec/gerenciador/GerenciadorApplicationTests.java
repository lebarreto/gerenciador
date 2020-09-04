package br.gov.sp.fatec.gerenciador;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.HashSet;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import br.gov.sp.fatec.gerenciador.entity.Appointment;
import br.gov.sp.fatec.gerenciador.entity.Authorization;
import br.gov.sp.fatec.gerenciador.entity.School;
import br.gov.sp.fatec.gerenciador.entity.User;
import br.gov.sp.fatec.gerenciador.repository.AppointmentRepository;
import br.gov.sp.fatec.gerenciador.repository.AuthorizationRepository;
import br.gov.sp.fatec.gerenciador.repository.SchoolRepository;
import br.gov.sp.fatec.gerenciador.repository.UserRepository;

@SpringBootTest
//@Transactional
//@Rollback
class GerenciadorApplicationTests {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AuthorizationRepository authRepo;

	@Autowired 
	private SchoolRepository schoolRepo;
	
	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void insertUser() {
		User user = new User();
		
		user.setCpf(47537311897L);
		user.setName("Letícia Barreto");
		user.setEmail("leticia@gmail.com");
		user.setPwd("123123");
		
		user.setAuth(new HashSet<Authorization>());
		
		Authorization aut = new Authorization();
		aut.setName("ALUNO");
	
		authRepo.save(aut);
		
		user.getAuth().add(aut);
		
		user.setSchool_id(new HashSet<School>());
		
		School school = new School();
		school.setName("Auto escola 01");
		school.setAddress("Rua 123, Bairro 01");
		school.setCity("São José dos Campos");
		school.setUf("SP");
		school.setZip(12240120L);
		school.setCel("(12) 91234-5542");
		
		schoolRepo.save(school);
		
		user.getSchool_id().add(school);
		
		user.setAppointment(new HashSet<Appointment>());
		
		Appointment appointment = new Appointment();
		appointment.setName("Aula prática 01");
		appointment.setDate(new Date());
		appointment.setStudent(new HashSet<User>());
		
		appointmentRepo.save(appointment);
		
		user.getAppointment().add(appointment);
		
		userRepo.save(user);
		
		assertNotNull(user.getAuth().iterator().next().getId());
	}

}
