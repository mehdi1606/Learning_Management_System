package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}