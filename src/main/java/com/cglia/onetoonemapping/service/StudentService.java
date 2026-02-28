package com.cglia.onetoonemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.onetoonemapping.entity.Student;
import com.cglia.onetoonemapping.repository.StudentRepository;
//Service Class New
@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(int id, Student updatedStudent) {
		Student existingStudent = studentRepository.findById(id).orElse(null);
		if (existingStudent != null) {
			existingStudent.setName(updatedStudent.getName());
			existingStudent.setAbout(updatedStudent.getAbout());
			existingStudent.setLaptop(updatedStudent.getLaptop());
			return studentRepository.save(existingStudent);
		} else {
			return null;
		}
	}

	public boolean deleteStudent(int id) {
		Student existingStudent = studentRepository.findById(id).orElse(null);
		if (existingStudent != null) {
			studentRepository.delete(existingStudent);
			return true;
		} else {
			return false;
		}
	}

}


