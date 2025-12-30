package com.adina.eduapp.repository;

import com.adina.eduapp.entity.Enrollment;
import com.adina.eduapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
