package com.adina.eduapp.dto.response;

import com.adina.eduapp.entity.EnrollmentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentResponseDto {
    private CourseResponseDto course;
    private EnrollmentStatus enrollmentStatus;
    private Integer grade;
    private UserResponseDto student;
}
