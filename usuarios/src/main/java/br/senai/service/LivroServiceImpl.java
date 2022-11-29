package br.senai.service;

import br.senai.model.Livro;
import br.senai.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LivroServiceImpl implements LivroService{

    @Autowired
    LivroRepository livroRepository;

    @Override
    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    @Override
    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    @Override
    public Livro create(Livro livro) {
        return livroRepository.save(livro);
    }

    @Override
    public Livro update(Livro livro, long id) {
        Optional<Livro> a = livroRepository.findById(id);
        if (!a.isEmpty()){
            Livro livroUpdate = a.get();
            livroUpdate.setTitulo(livro.getTitulo());
            livroUpdate.setAutor(livro.getAutor());
            livroUpdate.setEditora(livro.getEditora());
            return livroRepository.save(livroUpdate);
        }else{
            return null;

        }
    }

    @Override
    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
