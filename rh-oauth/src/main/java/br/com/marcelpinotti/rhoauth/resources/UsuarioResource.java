package br.com.marcelpinotti.rhoauth.resources;

import br.com.marcelpinotti.rhoauth.entities.Usuario;
import br.com.marcelpinotti.rhoauth.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping(value = "/procurar")
    public ResponseEntity<Usuario> burcarUsuarioPorEmail(@RequestParam String email){
        try {
            Usuario usuario = usuarioService.buscarPorEmail(email);
            return ResponseEntity.ok(usuario);
        } catch (IllegalArgumentException ie) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
