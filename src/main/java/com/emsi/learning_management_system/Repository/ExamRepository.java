package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}