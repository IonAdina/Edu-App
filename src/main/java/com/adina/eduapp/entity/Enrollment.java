package com.adina.eduapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne  //many enr for one student
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne  //many enr for one course
    @JoinColumn(name = "course_id")
    private Course course;

    private Integer grade;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentStatus;
}
