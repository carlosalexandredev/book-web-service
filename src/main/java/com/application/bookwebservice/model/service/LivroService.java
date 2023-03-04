package com.application.bookwebservice.model.service;

import com.application.bookwebservice.model.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LivroService {

    private List<Livro> livros = new ArrayList<>();

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

    public Livro criaLivro(Livro livro) {
        Long id;
        if(livros.isEmpty())
            id = 1L;
        else
            id = livros.get(livros.size() - 1).getId() + 1;

        livro.setId(id);
        livros.add(livro);
        return livro;
    }

    public void deletaLivro(Long id) {
        Livro livro = buscaPorId(id);
        livros.remove(livro);
    }
}
