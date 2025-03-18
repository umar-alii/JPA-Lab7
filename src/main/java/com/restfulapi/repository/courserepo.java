package com.restfulapi.repository;

import com.restfulapi.entity.course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface courserepo extends JpaRepository<course, Long> {

    List<course> findByProfessorId(Long professorId);

    List<course> findByStudentsId(Long studentId);
}
