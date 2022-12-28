package com.faith.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.model.Student;
import com.faith.repository.StudentRepository;
import com.faith.servicce.SequenceGeneratorService;
import com.faith.servicce.StudentImplementation;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StudentController {
	
	
	@Autowired
	StudentImplementation studentservice;
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	@CrossOrigin
	@GetMapping("/listStudents")
    public List<Student> getAllPosts()
    {
        return studentservice.getStudent();
    }
    @PostMapping("/addStudent")
    @CrossOrigin 
    public Student addStudent(@Valid @RequestBody Student student)
    {
    	
    	long id = (sequenceGeneratorService.generateSequence(Student.SEQUENCE_NAME));
    	student.admissionNum= "R-00"+Long.toString(id);
        return studentservice.saveStudent(student);
		
    }


}
