package com.my.contactbook.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class SubjectDTO {

    private long subjectId;
    private String subjectName;
    private String subjectGrade;
}
