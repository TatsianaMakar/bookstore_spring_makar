package com.company.service.impl;

import com.company.dao.entity.Book;
import com.company.dao.entity.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

//    public static Cart createCart() {
//        if (cart == null) {
//            Cart cart = new Cart();
//        }
//    }

    public static boolean addBook(List<Book> card, Book book) {
        if (book != null) {
            return card.add(book);
        }
        return false;
    }

    public static boolean deleteBook(List<Book> card, Book book) {
        return card.remove(book);
    }
}
