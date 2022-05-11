package br.com.marcelpinotti.rhfolhadepagamento.resources;

import br.com.marcelpinotti.rhfolhadepagamento.entities.Pagamento;
import br.com.marcelpinotti.rhfolhadepagamento.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {

    @Autowired
    private PagamentoService service;

    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> efetuarPagamento(@PathVariable Long trabalhadorId , @PathVariable int dias){
        return ResponseEntity.ok(service.getPagamento(trabalhadorId,dias));
    }
}
