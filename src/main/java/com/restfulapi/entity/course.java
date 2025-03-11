package com.restfulapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CourseID;

    private String Coursename;

    private int credits;

}
