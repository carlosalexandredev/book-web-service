package com.application.bookwebservice.controller;

import com.application.bookwebservice.model.entity.Livro;
import com.application.bookwebservice.model.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/ola")
    public String olaMundo(){
        return "Olá mundo";
    }


    @GetMapping
    public ResponseEntity<List<Livro>> buscaTodosLivros(){
        List<Livro> livros = livroService.buscaTodos();
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscaPorId(@PathVariable Long id){
        Livro livro = livroService.buscaPorId(id);
        return livro == null ? ResponseEntity.status(HttpStatus.NO_CONTENT).build() : ResponseEntity.status(HttpStatus.OK).body(livro);
    }

}
