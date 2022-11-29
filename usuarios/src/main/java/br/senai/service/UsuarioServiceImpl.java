package br.senai.service;

import br.senai.model.Usuario;
import br.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;
    //impl é implements
    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario, long id) {
        Optional<Usuario> u = usuarioRepository.findById(id);
        if(!u.isEmpty()){
            Usuario usuarioUpdate = u.get();
            usuarioUpdate.setNome(usuario.getNome());
            usuarioUpdate.setUsername(usuario.getUsername());
            usuarioUpdate.setSenha(usuario.getSenha());
            return usuarioRepository.save(usuarioUpdate);
        }else {
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    //escrevi "implements UsuarioService" e cliquei pra gerar na lampada vermelha
}
