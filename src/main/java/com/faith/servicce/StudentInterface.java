package com.faith.servicce;

import java.util.List;

import com.faith.model.Student;



public interface StudentInterface {

        public List<Student> getStudent();
	
		public Student saveStudent(Student Student);
		
//		public  List<Student> getStudentSort();
}
