package com.restfulapi.DTO;

import lombok.Data;

import java.util.List;

@Data
public class teacherDTO {
    private Long TeacherID;
    private String name;

    private List<courseDTO> coursestought;



}
