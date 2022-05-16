package br.com.marcelpinotti.rhoauth.entities;

import java.io.Serializable;
import java.util.Objects;

public class Funcao implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String funcao;

    public Funcao() {
    }

    public Funcao(Long id, String funcao) {
        this.id = id;
        this.funcao = funcao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcao funcao1 = (Funcao) o;
        return funcao.equals(funcao1.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcao);
    }
}
