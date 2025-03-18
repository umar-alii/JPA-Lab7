package com.restfulapi.service;

import com.restfulapi.entity.course;
import com.restfulapi.repository.courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseservice {

    @Autowired
    private courserepo courseRepository;

    public List<course> getCoursesByProfessor(Long professorId) {
        return courseRepository.findByProfessorId(professorId);
    }

    public List<course> getCoursesByStudent(Long studentId) {
        return courseRepository.findByStudentsId(studentId);
    }
}
