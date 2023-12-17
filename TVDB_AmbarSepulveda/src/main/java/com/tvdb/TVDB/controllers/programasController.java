package com.tvdb.TVDB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class programasController {

    @GetMapping("/programas")
    public String programas() {
        return "event/programas.jsp";
    }
}
