package br.com.marcelpinotti.rhtrabalhadores.resources;


import br.com.marcelpinotti.rhtrabalhadores.entities.Trabalhador;
import br.com.marcelpinotti.rhtrabalhadores.repositories.TrabalhadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

    //@Value("${test.config}")
    //private String testConfigs;

    //private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);

    @Autowired
    private TrabalhadorRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping(value = "/configs")
    public ResponseEntity<List<Void>> listaDeTrabalhadoresConfig(){
        //logger.info("CONFIG " + testConfigs);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<Trabalhador>> listaDeTrabalhadores(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> buscarPorId(@PathVariable Long id){
       // logger.info("Port = " + environment.getProperty("local.server.port"));
        return ResponseEntity.ok().body(repository.findById(id).get());
    }

}
