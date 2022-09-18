package com.company.dao.entity;

import lombok.Data;

@Data
public class Cart {
    private Book book;
    private User user;
    private int quantity;
}
