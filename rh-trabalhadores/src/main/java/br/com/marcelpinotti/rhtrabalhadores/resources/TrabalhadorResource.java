package br.com.marcelpinotti.rhtrabalhadores.resources;

import br.com.marcelpinotti.rhtrabalhadores.entities.Trabalhador;
import br.com.marcelpinotti.rhtrabalhadores.repositories.TrabalhadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

    private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);

    @Autowired
    private TrabalhadorRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<List<Trabalhador>> listaDeTrabalhadores(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> buscarPorId(@PathVariable Long id){
        logger.info("Port = " + environment.getProperty("local.server.port"));
        return ResponseEntity.ok().body(repository.findById(id).get());
    }

}
