package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}