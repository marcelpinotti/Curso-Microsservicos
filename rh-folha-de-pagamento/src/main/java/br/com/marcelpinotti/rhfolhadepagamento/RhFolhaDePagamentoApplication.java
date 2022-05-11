package br.com.marcelpinotti.rhfolhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@RibbonClient(name="rh-trabalhador")
@SpringBootApplication
public class RhFolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaDePagamentoApplication.class, args);
	}

}
