package com.restfulapi.repository;

import com.restfulapi.entity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface teacherrepo extends JpaRepository<teacher, Long> {

    Optional<teacher> findById(Long id);
}
