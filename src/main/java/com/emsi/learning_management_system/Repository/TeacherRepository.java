package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}