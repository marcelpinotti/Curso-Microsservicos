package br.com.marcelpinotti.rhusuario.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_funcoes")
public class Funcao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
