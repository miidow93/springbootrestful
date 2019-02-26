package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Student;
import com.sample.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	StudentRepository studentRepo;
	
	@Autowired
	StudentController(StudentRepository sr) {
		this.studentRepo = sr;
	}
	
	/*@GetMapping("/")
	public List<Student> index() {
		return studentRepo.findAll();
	} */
	
	@GetMapping("/all")
	public List<Student> all() {
		return studentRepo.findAll();
	}
	
	@GetMapping("/add")
	public void add() {
		Student s = new Student("EsSalhi", 23);
		studentRepo.save(s);
	}

}
