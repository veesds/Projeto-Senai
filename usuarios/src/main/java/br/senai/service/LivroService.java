package br.senai.service;

import br.senai.model.Livro;

import java.util.List;
import java.util.Optional;

public interface LivroService {

    public List<Livro> findAll();

    public Optional<Livro> findById(Long id);

    public Livro create(Livro livro);

    public Livro update(Livro livro, long id);

    public void delete(Long id);
}
