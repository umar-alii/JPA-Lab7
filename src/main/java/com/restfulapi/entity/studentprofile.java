package com.restfulapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="student_profiles")
@Data
public class studentprofile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String address;
    private String phone;
    private Long dob;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name="student_id", referencedColumnName="id")
    private student student;
}
