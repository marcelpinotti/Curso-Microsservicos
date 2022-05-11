package br.com.marcelpinotti.rhtrabalhadores.repositories;

import br.com.marcelpinotti.rhtrabalhadores.entities.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {
}
