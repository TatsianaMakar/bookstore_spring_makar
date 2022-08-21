package com.company.controller;

import com.company.repository.entity.Book;
import com.company.repository.entity.User;
import com.company.service.impl.BookServiceImpl;
import com.company.service.impl.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("update_book_form")
public class UpdateBookFormCommand implements Command {
    private final BookServiceImpl bookService;

    @Autowired
    public UpdateBookFormCommand(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @Override
    public String execute(HttpServletRequest req) {
        Long id = Long.parseLong(req.getParameter("id"));
        Book book = bookService.findById(id);
        req.setAttribute("book", book);
        return "jsp/updateBookForm.jsp";
    }
}