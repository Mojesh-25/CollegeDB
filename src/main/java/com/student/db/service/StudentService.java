package com.student.db.service;
import com.student.db.repository.*;

import java.util.List;

import org.springframework.stereotype.Service;
import com.student.db.model.*;
@Service
public class StudentService {
	private final StudentRepository studentRepository;

	StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Student  addUser(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> allUser() {
		return studentRepository.findAll();
	}
	
	
	public Student findById(Long id){
		return studentRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		studentRepository.deleteById(id);
	}
}
