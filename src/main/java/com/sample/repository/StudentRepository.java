package com.sample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
	 public Optional<Student> findById(Long Id);
}
