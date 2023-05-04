package com.cracken.bookseller.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="username", length = 100 ,nullable = false, unique = true)
    private String username;


    @Column(name = "password",nullable = false,length = 100)
    private String password;

    @Column(name= "name",length = 100,nullable = false)
    private String name;

    @Column(name="create_at",nullable = false)
    private LocalDateTime creatAt;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name="role",nullable = false)
    private Role role;



}
