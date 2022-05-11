package br.com.marcelpinotti.rhfolhadepagamento.entities;

import java.io.Serializable;
import java.util.Objects;

public class Trabalhador implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private Double valorPorDia;

    public Trabalhador(){
    }

    public Trabalhador(Long id, String nome, Double valorPorDia) {
        this.id = id;
        this.nome = nome;
        this.valorPorDia = valorPorDia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(Double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabalhador that = (Trabalhador) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
