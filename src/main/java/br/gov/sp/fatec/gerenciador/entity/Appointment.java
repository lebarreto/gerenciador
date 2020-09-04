package br.gov.sp.fatec.gerenciador.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "date", nullable = false)
	private Date date;
	
	@ManyToMany (fetch = FetchType.LAZY, mappedBy = "appointment")
	private Set<User> student;
//	
//	@ManyToMany (fetch = FetchType.LAZY, mappedBy = "appointment")
//	@JoinColumn(name = "instructor_id")
//	private Set<User> instructor;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setStudent(Set<User> student) {
		this.student = student;
	}
	
	public Set<User> getStudent() {
		return student;
	}
	
//	public void setInstructor(Set<User> instructor) {
//		this.instructor = instructor;
//	}
//	
//	public Set<User> getInstructor() {
//		return instructor;
//	}
}

