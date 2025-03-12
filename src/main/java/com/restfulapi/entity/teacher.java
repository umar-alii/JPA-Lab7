package com.restfulapi.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Teachers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TeacherID;

    private String name;

    @OneToMany(mappedBy = "course" , cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<course> Coursestought;

    public List<course> getCoursestought() {
        return Coursestought;
    }

    public void setCoursestought(List<course> Coursestought) {
        this.Coursestought = Coursestought;
        Coursestought.addAll(Coursestought);
    }

}
