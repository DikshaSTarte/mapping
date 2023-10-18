package com.MappingEX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MappingEX.Repository.StudentRepo;
import com.MappingEX.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

}
