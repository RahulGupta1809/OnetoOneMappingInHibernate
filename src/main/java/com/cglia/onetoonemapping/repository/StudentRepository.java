package com.cglia.onetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cglia.onetoonemapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}