package br.senai.repository;

import br.senai.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//extends é herança
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
