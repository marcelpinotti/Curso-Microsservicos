package br.com.marcelpinotti.rhusuario.repositories;

import br.com.marcelpinotti.rhusuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
