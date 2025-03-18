package com.restfulapi.service;

import com.restfulapi.entity.student;
import com.restfulapi.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentservice {

    @Autowired
    private studentrepo studentRepository;

    public student saveStudent(student student) {
        return studentRepository.save(student);
    }

    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
}
