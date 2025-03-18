package com.restfulapi.repository;

import com.restfulapi.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface studentrepo extends JpaRepository<student, Long> {

    Optional<student> findById(Long id); // Returns a List instead of Optional
}
