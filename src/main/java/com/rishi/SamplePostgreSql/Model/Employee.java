package com.rishi.SamplePostgreSql.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	@Column(name = "name", nullable = false)
    private String name;

	@Column(name = "lastname", nullable = false)
    private String lastname;

	@Column(name = "email", nullable = false)
    private String email;
    
	
	


	public Employee(int id, String name, String lastname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}


	public Employee() {
		super();
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
 
}