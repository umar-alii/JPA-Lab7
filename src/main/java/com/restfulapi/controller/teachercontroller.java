package com.restfulapi.controller;


import com.restfulapi.entity.teacher;
import com.restfulapi.service.teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professors")
public class teachercontroller {

    @Autowired
    private teacherservice professorService;

    @GetMapping("/{id}")
    public Optional<teacher> getProfessorById(@PathVariable Long id) {
        return professorService.getProfessorById(id);
    }

    @GetMapping("/all")
    public List<teacher> getAllProfessors() {
        return professorService.getAllProfessors();
    }
}
