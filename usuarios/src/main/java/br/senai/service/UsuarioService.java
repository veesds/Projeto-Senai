package br.senai.service;

import br.senai.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    //pesquise todos
    public List<Usuario> findAll();
    //pesquise pelo usuário a partir do id
    public Optional<Usuario> findById(Long id);
    //novo usuário
    public Usuario create(Usuario usuario);
    //editar usuário
    public Usuario update(Usuario usuario, long id); //retonar usuário
    //deletar usuário
    public void delete(Long id); //void é vazio (retorna vazio já que deleta)

}
