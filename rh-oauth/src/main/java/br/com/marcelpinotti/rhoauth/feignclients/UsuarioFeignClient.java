package br.com.marcelpinotti.rhoauth.feignclients;

import br.com.marcelpinotti.rhoauth.entities.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "rh-usuario", path = "/usuarios")
public interface UsuarioFeignClient {

    @GetMapping(value = "/procurar")
    ResponseEntity<Usuario> buscarPorEmail(@RequestParam String email);
}
