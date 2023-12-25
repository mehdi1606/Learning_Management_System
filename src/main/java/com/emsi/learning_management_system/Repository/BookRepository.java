package com.emsi.learning_management_system.Repository;

import com.emsi.learning_management_system.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}