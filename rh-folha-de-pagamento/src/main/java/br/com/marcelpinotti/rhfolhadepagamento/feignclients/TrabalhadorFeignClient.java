package br.com.marcelpinotti.rhfolhadepagamento.feignclients;

import br.com.marcelpinotti.rhfolhadepagamento.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
/*
Sem balanceamento de carga
@FeignClient(name = "rh-trabalhador", url = "localhost:8001", path = "/trabalhadores")
 */
@FeignClient(name = "rh-trabalhador", path = "/trabalhadores")
public interface TrabalhadorFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> buscarPorId(@PathVariable Long id);

}
