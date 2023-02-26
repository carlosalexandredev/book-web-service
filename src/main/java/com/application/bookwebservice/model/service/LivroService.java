package com.application.bookwebservice.model.service;

import com.application.bookwebservice.model.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LivroService {

    private List<Livro> livros = Arrays.asList(
            new Livro(1L, "Harry Potter", "J.W"),
            new Livro(2L, "Três Porquinhos", "Desconhecido"));

    public List<Livro> buscaTodos() {
        return livros;
    }

    public Livro buscaPorId(Long id) {
       for(Livro livro: livros){
           if(livro.getId() == id)
               return livro;
       }
       return null;
    }
}
