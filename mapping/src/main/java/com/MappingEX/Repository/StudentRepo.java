package com.MappingEX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MappingEX.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
