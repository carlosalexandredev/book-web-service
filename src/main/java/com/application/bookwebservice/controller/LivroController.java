package com.application.bookwebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livro")
public class LivroController {

    @GetMapping
    public String olaMundo(){
        return "Olá mundo";
    }
}
