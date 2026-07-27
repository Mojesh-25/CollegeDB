package com.student.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.db.model.*;
public interface StudentRepository  extends JpaRepository<Student,Long>{

}
