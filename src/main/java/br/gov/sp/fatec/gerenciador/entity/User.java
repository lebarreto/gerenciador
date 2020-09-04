package br.gov.sp.fatec.gerenciador.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private Long cpf;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "pwd", nullable = false)
	private String pwd;
	
	@ManyToMany (fetch = FetchType.EAGER)
	@JoinTable (name = "usr_auth", 
		joinColumns = { @JoinColumn (name = "usr_id") },
		inverseJoinColumns = { @JoinColumn (name = "auth_id")}
	)
	private Set<Authorization> auth;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity = School.class)
	@JoinTable (name = "usr_school", 
		joinColumns = { @JoinColumn (name = "usr_id") },
		inverseJoinColumns = { @JoinColumn (name = "school_id")}
	)
	private Set<School> school_id;
	
	@ManyToMany (fetch = FetchType.EAGER)
	@JoinTable (name = "usr_appoin", 
		joinColumns = { @JoinColumn (name = "usr_id") },
		inverseJoinColumns = { @JoinColumn (name = "appoin_id")}
	)
	private Set<Appointment> appointment;
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Long getCpf() {
		return cpf;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setAuth(Set<Authorization> auth) {
		this.auth = auth;
	}
	
	public Set<Authorization> getAuth() {
		return auth;
	}
	
	public void setSchool_id(Set<School> school_id) {
		this.school_id = school_id;
	}
	
	public Set<School> getSchool_id() {
		return school_id;
	}
	
	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}
	
	public Set<Appointment> getAppointment() {
		return appointment;
	}
	
}
