package com.company.web.controller;

import com.company.dao.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/card")
public class CardController {
    @GetMapping("/create")
    public String createCard() {
        return "card";
    }

}
