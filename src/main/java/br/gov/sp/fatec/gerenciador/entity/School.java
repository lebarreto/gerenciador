package br.gov.sp.fatec.gerenciador.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "school")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false,  unique = true)
	private String name;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "uf", nullable = false, length = 2)
	private String uf;
	
	@Column(name = "zip", nullable = false)
	private Long zip;
	
	@Column(name = "cel", nullable = false)
	private String cel;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school_id")
	private Set<User> user;
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setZip(Long zip) {
		this.zip = zip;
	}
	
	public Long getZip() {
		return zip;
	}
	
	public void setCel(String cel) {
		this.cel = cel;
	}
	
	public String getCel() {
		return cel;
	}
	
	public void setUser(Set<User> user) {
		this.user = user;
	}
	
	public Set<User> getUser() {
		return user;
	}
}
