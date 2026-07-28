package com.student.db.service;
import com.student.db.repository.*;
import com.student.db.model.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
	private final EnrollmentRepository enrollmentRepository;

	EnrollmentService(EnrollmentRepository enrollmentRepository) {
		this.enrollmentRepository = enrollmentRepository;
	} 
	
	public Enrollment saveEnrollment(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}
	
	public List<Enrollment>getAll(){
		return enrollmentRepository.findAll();
	}
	
	public Enrollment enrollmentById(long id) {
		return enrollmentRepository.findById(id).orElse(null);
	}
	
	public void deleteEnrollment(long id) {
		enrollmentRepository.deleteById(id);
	}

}
