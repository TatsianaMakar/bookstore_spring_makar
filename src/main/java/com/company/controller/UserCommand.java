package com.company.controller;

import com.company.entity.User;
import com.company.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserCommand implements Command {
    private final UserService userService;

    public UserCommand(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest req) {
        String rawId = req.getParameter("id");
        Long idUser = Long.parseLong(rawId);
        User user = userService.getById(idUser);
        req.setAttribute("user", user);
        return "jsp/user.jsp";
    }

}
