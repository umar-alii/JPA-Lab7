package com.restfulapi.controller;

import com.restfulapi.entity.student;
import com.restfulapi.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentcontroller {
    @Autowired
    private studentservice stdservice;

    @PostMapping()
    public student addstudent(@RequestBody student student){
        if(student.getStudentprofile() != null){
            student.getStudentprofile().setStudent(student);
        }
        return stdservice.savestudent(student);
    }

    @GetMapping("/all")
    public List<student> getAllstudent(){
        return stdservice.getallstudents();
    }

    @GetMapping("get/{id}")
    public student getstudentbyid(@PathVariable Long id){
        return stdservice.getstudentbyid(id);
    }
}
