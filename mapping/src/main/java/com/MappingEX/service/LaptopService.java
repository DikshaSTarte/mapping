package com.MappingEX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MappingEX.Repository.LaptopRepo;
import com.MappingEX.entity.Laptop;

@Service
public class LaptopService {
	@Autowired
	private LaptopRepo laptopRepo;
	
	public Laptop createLaptop(Laptop laptop) {
		return laptopRepo.save(laptop);
	}
	

}
