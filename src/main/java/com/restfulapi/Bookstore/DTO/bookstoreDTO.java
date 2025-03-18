package com.restfulapi.Bookstore.DTO;

import lombok.Data;

@Data
public class bookstoreDTO {

    private String bookname;

    private String author;
    private int price;
    private int stock;
}
