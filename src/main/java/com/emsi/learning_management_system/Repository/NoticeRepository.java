package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}