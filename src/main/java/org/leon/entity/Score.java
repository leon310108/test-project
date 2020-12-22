package org.leon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Score {

	@Id
	@GeneratedValue
	private Long courseId;
	private String courseName;
	private String teacherName;
	private String studentName;
	private Integer score;
}
