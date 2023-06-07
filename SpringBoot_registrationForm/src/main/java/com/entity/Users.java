package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "userTable")
public class Users {
	
	@Id
	private String name;
	private Integer age;
	private String email;
	private String password;
	private String cpassword;
	private String phoneno;
	private String gender;

}
