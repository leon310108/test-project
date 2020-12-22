package org.leon.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Teacher {

	@Id
	@GeneratedValue
	private Long id;
	private Person person;
	private String password;
	private List<Student> students;
	private List<Course> courses;
	private Integer authorityId;
}
