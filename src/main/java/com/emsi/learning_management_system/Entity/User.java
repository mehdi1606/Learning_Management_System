package com.emsi.learning_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;

    @OneToMany(mappedBy = "user")
    private Set<Student> students;

    @OneToMany(mappedBy = "user")
    private Set<Teacher> teachers;

    @OneToMany(mappedBy = "user")
    private Set<Parent> parents;

    @OneToMany(mappedBy = "user")
    private Set<Accountant> accountants;


}