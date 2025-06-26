package com.budgetapp.backend.users;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "app_user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String email;

    private String firstName;
    private String lastName;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime lastLogin;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    public enum Role {
        USER,
        SUPER_ADMIN
    }

    public User() {}
}
