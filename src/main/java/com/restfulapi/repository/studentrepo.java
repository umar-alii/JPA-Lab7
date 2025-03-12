package com.restfulapi.repository;

import com.restfulapi.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<student, Long> {
}
