package com.student.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.db.model.Enrollment;
import com.student.db.service.CourseService;
import com.student.db.service.EnrollmentService;
import com.student.db.service.StudentService;


@Controller
@RequestMapping("/enrollment")
public class EnrollmentController {

    private final StudentService studentService;
    private final CourseService courseService;
    private final EnrollmentService enrollmentService;


    public EnrollmentController(StudentService studentService,
                                CourseService courseService,
                                EnrollmentService enrollmentService) {

        this.studentService = studentService;
        this.courseService = courseService;
        this.enrollmentService = enrollmentService;
    }


    @GetMapping
    public String enrollmentPage(Model model) {

        model.addAttribute("students", studentService.allUser());
        model.addAttribute("courses", courseService.allCourses());

        return "enrollment";
    }


    @PostMapping("/add")
    public String saveEnrollment(@ModelAttribute Enrollment enrollment) {

        enrollmentService.saveEnrollment(enrollment);

        return "redirect:/enrollment";
    }

}
//	
//	//private final EnrollmentService enrollmentService ;
    
//	@PostMapping("/add")
//	public Enrollment saveEnrollment(@ModelAttribute Enrollment enrollment) {
//		return enrollmentService.saveEnrollment(enrollment);
//	}
//	
//	@GetMapping("/all")
//	public List<Enrollment> getAll(){
//		return enrollmentService.getAll();
//	}
//	
//	@GetMapping("/{id}")
//	public Enrollment enrollmentById(@PathVariable Long id) {
//		return enrollmentService.enrollmentById(id);
//	}
//	
//	@DeleteMapping("/{id}")
//	public void enrollmentById1(@PathVariable Long id) {
//		 enrollmentService.deleteEnrollment(id);
//	}

