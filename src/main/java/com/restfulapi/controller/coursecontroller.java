package com.restfulapi.controller;

import com.restfulapi.entity.course;
import com.restfulapi.service.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class coursecontroller {

    @Autowired
    private courseservice courseService;

    @GetMapping("/professor/{id}")
    public List<course> getCoursesByProfessor(@PathVariable Long id) {
        return courseService.getCoursesByProfessor(id);
    }

    @GetMapping("/student/{id}")
    public List<course> getCoursesByStudent(@PathVariable Long id) {
        return courseService.getCoursesByStudent(id);
    }
}
