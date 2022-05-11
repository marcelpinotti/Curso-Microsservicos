package br.com.marcelpinotti.rhtrabalhadores.resources;

import br.com.marcelpinotti.rhtrabalhadores.entities.Trabalhador;
import br.com.marcelpinotti.rhtrabalhadores.repositories.TrabalhadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {
    @Autowired
    private TrabalhadorRepository repository;

    @GetMapping
    public ResponseEntity<List<Trabalhador>> listaDeTrabalhadores(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(repository.findById(id).get());
    }

}
