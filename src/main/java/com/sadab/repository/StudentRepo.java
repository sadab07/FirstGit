package com.sadab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadab.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {}