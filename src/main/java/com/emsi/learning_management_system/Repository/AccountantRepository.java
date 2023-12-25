package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Accountant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountantRepository extends JpaRepository<Accountant, Long> {
}