package com.cracken.bookseller.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_history")
@Data
public class Purchase {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id",nullable = false)
    private Long userId;

    @Column(name="book_id",nullable = false)
    private Long bookId;

    @Column(name="prices",nullable = false)
    private Double price;

    @Column(name = "purchase_time",nullable=false)
    private LocalDateTime purchaseTime;


}
