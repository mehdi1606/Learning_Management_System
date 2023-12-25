package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}