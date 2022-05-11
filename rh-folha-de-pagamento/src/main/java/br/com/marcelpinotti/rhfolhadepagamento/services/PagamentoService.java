package br.com.marcelpinotti.rhfolhadepagamento.services;

import br.com.marcelpinotti.rhfolhadepagamento.entities.Pagamento;
import br.com.marcelpinotti.rhfolhadepagamento.entities.Trabalhador;
import br.com.marcelpinotti.rhfolhadepagamento.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

   //@Value("${rh-trabalhador.host}")
    //private String trabalhadorHost;

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private TrabalhadorFeignClient feignClient;


    public Pagamento getPagamento(long trabalhadorId, int dias) {

        //String trabalhadorIdStr = String.valueOf(trabalhadorId);
        //Map<String, String> variaveisDaUri = new HashMap<>();
        //variaveisDaUri.put("id", trabalhadorIdStr);
        //Trabalhador trabalhador = restTemplate.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class, variaveisDaUri);

        Trabalhador trabalhador = feignClient.buscarPorId(trabalhadorId).getBody();
        return new Pagamento(trabalhador.getNome(), trabalhador.getValorPorDia(), dias);
    }
}
