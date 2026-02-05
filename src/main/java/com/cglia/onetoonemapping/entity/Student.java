package com.cglia.onetoonemapping.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mapping_student")
public class Student {

	//Entity
	@Id
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	private int studentId;

	@Column(name = "STUDENT_NAME")
	private String name;

	@Column(name = "STUDENT_ABOUT")
	private String about;

	// OneToOne
	@OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "laptopId")
	private Laptop laptop;

	/*// OneToMany
	@OneToMany( cascade = CascadeType.ALL, mappedBy = "student")
	private List<Address> addresslist = new ArrayList<>();

	public List<Address> getAddresslist() {
		return addresslist;
	}

	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}*/

	public Student() {

	}

	public Student(int studentId, String name, String about, Laptop laptop) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.about = about;
		this.laptop = laptop;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}

