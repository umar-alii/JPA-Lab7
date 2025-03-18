package com.restfulapi.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Students")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonManagedReference
    @OneToOne(mappedBy = "student", cascade=CascadeType.ALL)
    private studentprofile studentprofile;

    public void setStudentprofile(studentprofile studentprofile) {
        this.studentprofile = studentprofile;
        if (studentprofile != null) {
            studentprofile.setStudent(this);
        }
    }
}