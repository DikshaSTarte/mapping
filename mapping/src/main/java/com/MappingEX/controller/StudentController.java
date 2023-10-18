package com.MappingEX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MappingEX.entity.Student;
import com.MappingEX.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student createStudent = studentService.createStudent(student);
		return new ResponseEntity<>(createStudent,HttpStatus.CREATED);
		
	}
	

}
