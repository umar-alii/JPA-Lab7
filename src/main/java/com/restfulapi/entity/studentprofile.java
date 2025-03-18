package com.restfulapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="studentprofile")
@Data
public class studentprofile {
    @Id
    private Long id;

    private String email;

    private String address;

    private String phone;

    private Long DOB;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name="Student_Id", referencedColumnName="Id")
    private student student;



}
