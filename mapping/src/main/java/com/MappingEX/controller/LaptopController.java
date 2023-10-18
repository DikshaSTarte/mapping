package com.MappingEX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MappingEX.entity.Laptop;
import com.MappingEX.entity.Student;
import com.MappingEX.service.LaptopService;
import com.MappingEX.service.StudentService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	@PostMapping
	public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop){
		Laptop createLaptop = laptopService.createLaptop(laptop);
		
		return new ResponseEntity<>(createLaptop, HttpStatus.CREATED);
		
	}
	

}
