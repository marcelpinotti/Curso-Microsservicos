package br.com.marcelpinotti.rhoauth.services;

import br.com.marcelpinotti.rhoauth.entities.Usuario;
import br.com.marcelpinotti.rhoauth.feignclients.UsuarioFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioFeignClient feignClient;

    public Usuario buscarPorEmail(String email){
        Usuario usuario = feignClient.buscarPorEmail(email).getBody();
        if(usuario == null){
            logger.error("Email não encontrado " + email);
            throw new IllegalArgumentException("Email não encontrado");
        }
        logger.info("Email encontrado " + email);
        return usuario;
    }
}
