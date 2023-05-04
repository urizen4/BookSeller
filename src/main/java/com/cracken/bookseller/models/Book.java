package com.cracken.bookseller.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title",nullable = false,length = 100)
    private String title;

    @Column(name="description",nullable = false,length = 100)
    private String description;

    @Column(name="author",nullable = false,length = 100)
    private String author;

    @Column(name="price",nullable = false)
    private  Double price;

    @Column(name="created_at",nullable=false)
    private LocalDateTime createdAt;

}
