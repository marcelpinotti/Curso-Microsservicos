package br.com.marcelpinotti.rhfolhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RhFolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaDePagamentoApplication.class, args);
	}

}
