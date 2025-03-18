package com.restfulapi.service;

import com.restfulapi.entity.teacher;
import com.restfulapi.repository.teacherrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class teacherservice {

    @Autowired
    private teacherrepo professorRepository;

    public Optional<teacher> getProfessorById(Long id) {
        return professorRepository.findById(id);
    }

    public List<teacher> getAllProfessors() {
        return professorRepository.findAll();
    }
}
