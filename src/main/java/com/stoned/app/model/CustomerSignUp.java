package com.stoned.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Entity
@Table(name="signup_table")
public class CustomerSignUp {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	
	private String firstname;
	
	private String lastname;
	
	private String dob;
	
	private String gender;
	
	private String email;
	
	private String phnumber;
	
	private String password;

}
