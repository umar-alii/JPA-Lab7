package com.restfulapi.Bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="bookstore")
@Data
public class bookstore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookname;
    private String author;
    private int price;
    private int stock;
}
