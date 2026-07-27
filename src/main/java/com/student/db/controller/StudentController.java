package com.student.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.db.service.*;
import com.student.db.model.*;

/*
//USING REST CONTROLLER
@RestController
public class StudentController {
	private final StudentService studentService;


	StudentController(StudentService studentService) {
		this.studentService = studentService;
	} 
	
	
	@GetMapping("/student")
	public String studentPage() {
		return "/student";
	}

	@PostMapping("/student/add")
	public void studentAdd(@ModelAttribute Student student) {
		studentService.addUser(student);
		
	}
	
	@GetMapping("student/all")
	public List<Student> studentAll(){
		return studentService.allUser();
		
	}
	
	@GetMapping("student/{id}")
	public Student studentById(@PathVariable Long id){
		return studentService.findById(id);
	}
	
	@DeleteMapping("student/{id}")
	public void deleteById(@PathVariable Long id) {
		studentService.findById(id);
	}
}
*/
//USING CONTROLLER

@Controller
@RequestMapping("student")
public class StudentController{
	private StudentService studentService ;
	
	public StudentController(StudentService studentService) {
	        this.studentService = studentService;
	}
	
	@GetMapping
	public String studentPage() {
		return "student";
	}
	@PostMapping("/add")
	public String studentAdd(@ModelAttribute Student student) {
		Student savedStudent = studentService.addUser(student);

		if (savedStudent != null) {
		    return "success";
		}

		return "student";
	}
	@GetMapping("/all")
	public List<Student> StudentAll(){
		return studentService.allUser();
	}
	@GetMapping("/{id}")
	public Student studentById1(Long id) {
		return studentService.findById(id);
	}
	@DeleteMapping("/{id}")
	public void studentById(Long id) {
		studentService.findById(id);
	}

	
}









