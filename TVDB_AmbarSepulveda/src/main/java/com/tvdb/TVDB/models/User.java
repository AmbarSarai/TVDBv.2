package com.tvdb.TVDB.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI autoincrement
    private Long id;

    @Size(min = 5, max = 50)
    private String name;

    @Size(min = 5, max = 100)
    @Email
    private String email;

    @Size(min = 10, max = 20)
    private String password;

    @Transient
    @Size(min = 10, max = 20)
    private String confirmPassword;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created_at;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updated_at;

    // * Default NOW()
    @PrePersist
    protected void onCreate() {
        this.created_at = new Date();
        this.updated_at = new Date();
    }

    // NOW() on update NOW()
    @PrePersist
    protected void onUpdate() {
        this.updated_at = new Date();
    }

}
