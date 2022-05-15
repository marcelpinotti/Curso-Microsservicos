package br.com.marcelpinotti.rhusuario.resources;

import br.com.marcelpinotti.rhusuario.entities.Usuario;
import br.com.marcelpinotti.rhusuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity<List<Usuario>> listaDeTrabalhadores() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(repository.findById(id).get());
    }

    @GetMapping(value = "/procurar")
    public ResponseEntity<Usuario> buscarPorEmail(@RequestParam String email){
        return ResponseEntity.ok().body(repository.findByEmail(email));
    }
}

