package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}