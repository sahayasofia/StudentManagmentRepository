package com.faith.servicce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;


import com.faith.model.Student;
import com.faith.repository.StudentRepository;
@Service

public class StudentImplementation implements StudentInterface {
	@Autowired
	StudentRepository studentrepo;
	Student student = new Student();

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentrepo.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}

	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}}


	 


