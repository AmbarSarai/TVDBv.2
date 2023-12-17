package com.tvdb.TVDB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import com.tvdb.TVDB.models.User;
import com.tvdb.TVDB.services.UserServices;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserServices userServices;

    @PostMapping("")
    public String create(
            @Valid @ModelAttribute("user") User user,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/index.jsp";
        } else {
            userServices.createUser(user);
            return "redirect:/user";
        }
    }

    @GetMapping("")
    public String index(
            @Valid @ModelAttribute("user") User user,
            BindingResult result) {
        return "user/index.jsp";
    }
}
