package br.com.marcelpinotti.rhfolhadepagamento.services;

import br.com.marcelpinotti.rhfolhadepagamento.entities.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    public Pagamento getPagamento(long trabalhadorId, int dias){
        return new Pagamento("Marcel", 200.00, dias);
    }
}
