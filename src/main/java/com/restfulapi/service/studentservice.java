package com.restfulapi.service;

import com.restfulapi.entity.student;
import com.restfulapi.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {
    @Autowired
    private studentrepo studentrepo;

    public student savestudent(student Student){
        return studentrepo.save(Student);
    }

    public List<student> getallstudents(){
        return studentrepo.findAll();
    }

    public student getstudentbyid(Long id){
        return studentrepo.findById(id).get();
    }

}
