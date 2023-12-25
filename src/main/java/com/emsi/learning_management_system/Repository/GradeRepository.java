package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}