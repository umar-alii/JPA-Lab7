package com.restfulapi.controller;

import com.restfulapi.entity.student;
import com.restfulapi.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class studentcontroller {

    @Autowired
    private studentservice studentService;

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/all")
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
