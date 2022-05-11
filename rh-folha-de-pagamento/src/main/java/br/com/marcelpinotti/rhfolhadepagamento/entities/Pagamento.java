package br.com.marcelpinotti.rhfolhadepagamento.entities;

import java.io.Serializable;

public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private Double valorPorDia;
    private Integer dias;

    public Pagamento(){
    }

    public Pagamento(String nome, Double valorPorDia, Integer dias) {
        this.nome = nome;
        this.valorPorDia = valorPorDia;
        this.dias = dias;
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

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public double getTotal(){
        return dias * valorPorDia;
    }
}
