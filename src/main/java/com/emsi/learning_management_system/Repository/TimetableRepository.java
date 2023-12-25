package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}