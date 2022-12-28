package com.faith.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Document(collection = "student")
public class Student {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id

	private String id;

	
//	@NotNull
//	@Pattern(regexp = "p^[a-zA-Z0-9]{3}", message = "length must be 3")

	private String name;
	private String dob;
     
//	@NotNull
//	@Pattern(regexp = "p^[a-zA-Z0-9]")
	private String className;

//	@NotNull
//	@Pattern(regexp = "p^[a-zA-Z0-9]{1}", message = "length must be 1")
	private String divisionName;
    
//	@NotNull
	private String gender;
	
	public String admissionNum;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String admissionNum, String name, String dob, String className, String divisionName,
			String gender) {
		super();
		this.id = id;
		this.admissionNum = admissionNum;
		this.name = name;
		this.dob = dob;
		this.className = className;
		this.divisionName = divisionName;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAdmissionNum() {
		return admissionNum;
	}

	public void setAdmissionNum(String admissionNum) {
		this.admissionNum = admissionNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClassName() {
		return className;
	}

	public void setClassNmae(String className) {
		this.className = className;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", admissionNum=" + admissionNum + ", name=" + name + ", dob=" + dob
				+ ", className=" + className + ", divisionName=" + divisionName + ", gender=" + gender + "]";
	}

}
