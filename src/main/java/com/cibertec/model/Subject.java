package com.cibertec.model;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	private int idSubject;
	private String code;
	private String name;
	private String level;
	private String teacher;
	
	@Override
	public String toString() {
		return "Subject [idSubject=] "+ idSubject + code+"]";
	}

	public int getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
