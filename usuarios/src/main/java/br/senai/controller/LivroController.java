package br.senai.controller;

import br.senai.model.Livro;
import br.senai.service.LivroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivroController {
    @Autowired
    LivroServiceImpl livroService;

    @GetMapping("/livro")
    public List<Livro> findAll(){return livroService.findAll();}

    @GetMapping("/livro/{id}")
    public Optional<Livro> findById(@PathVariable long id){ return livroService.findById(id);}

    @PostMapping("/livro")
    public Livro create(@RequestBody Livro livro){ return livroService.create(livro);}

    @PutMapping("/livro/{id}")
    public Livro update(@RequestBody Livro livro, @PathVariable long id){ return livroService.update(livro, id);}

    @DeleteMapping("/livro/{id}")
    public void delete(@PathVariable long id){livroService.delete(id);}

}
