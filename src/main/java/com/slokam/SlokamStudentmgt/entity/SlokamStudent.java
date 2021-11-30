package com.slokam.SlokamStudentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "slokamstudent")
public class SlokamStudent {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer age;
	private String qual;
	
	@OneToOne(mappedBy="sloakmstudent",cascade=CascadeType.ALL)
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	
	

}
