package com.dhruval.security.controller;

import com.dhruval.security.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> students = new ArrayList<>(List.of(
    new Student(1,"Navin", 65),new Student(2,"Aman",78)));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        students.add(student);
        return "Student added successfully";
    }
}
